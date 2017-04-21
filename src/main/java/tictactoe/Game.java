package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private PrintStream stream;
    private Map<Integer, String> grid;
    private BufferedReader reader;
    private Integer lastInput;

    public Game(PrintStream stream, BufferedReader reader) {
        this.stream = stream;
        this.grid = buildGrid();
        this.reader = reader;
    }

    private Map<Integer, String> buildGrid() {
        grid = new HashMap<Integer, String>() {
            {
                put(1, "1");
                put(2, "2");
                put(3, "3");
                put(4, "4");
                put(5, "5");
                put(6, "6");
                put(7, "7");
                put(8, "8");
                put(9, "9");
            }
        };
        return grid;
    }

    public void start() {
        displayGrid();
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
            grid.put(lastInput, "X");
            displayGrid();
        }

    }

    public void displayGrid() {
        for (Integer key : grid.keySet()) {
            stream.print(grid.get(key));

            if (key % 3 == 0) {
                stream.println();
                stream.println("-----");
            } else {
                stream.print("|");
            }
        }
    }

}
