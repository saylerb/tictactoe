package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream stream;
    private Grid grid;
    private BufferedReader reader;
    private Integer lastInput;

    public Game(PrintStream stream, BufferedReader reader, Grid grid) {
        this.stream = stream;
        this.grid = grid;
        this.reader = reader;
    }

    public void start() {
        grid.print();
        promptUser();
        getUserInput();
    }

    public void promptUser() {
        stream.println("Please enter a number: ");
    }

    public void getUserInput() {
        try {
            lastInput = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (lastInput > 0) {
            grid.changeValue(lastInput, "X");
            grid.print();
        }

    }



}
