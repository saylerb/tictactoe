package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream stream;
    private Grid grid;
    private BufferedReader reader;
    private Integer lastInput;
    private Integer currentPlayer;
    private GameRunning gameRunning;

    public Game(PrintStream stream, BufferedReader reader, Grid grid, GameRunning gameRunning) {
        this.stream = stream;
        this.grid = grid;
        this.reader = reader;
        this.currentPlayer = 1;
        this.gameRunning = gameRunning;
    }

    public void start() {
        gameRunning.startGame();

        while (gameRunning.isRunning()) {
            grid.print();
            promptUser();
            getUserInput();
            currentPlayer = getNextPlayer();
        }
    }

    public void promptUser() {
        stream.println("Player " + currentPlayer + " please enter a number: ");
    }

    private void getUserInput() {
        try {
            lastInput = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (lastInput > 0) {
            grid.changeValue(lastInput, currentPlayerValue());
        }
    }

    private Integer getNextPlayer() {
        if (currentPlayer == 1) {
            return 2;
        } else {
            return 1;
        }
    }

    private String currentPlayerValue() {
        if (currentPlayer == 1) {
            return "X";
        } else {
            return "O";
        }
    }
}
