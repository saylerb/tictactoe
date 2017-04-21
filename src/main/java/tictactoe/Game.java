package tictactoe;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private PrintStream stream;
    private Map<Integer, String> grid;

    public Game(PrintStream stream) {
       this.stream = stream;
       this.grid = buildGrid();
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
    }

    public void promptUser() {
        stream.println("Please enter a number: ");
    }
    public void displayGrid() {
        for (Integer key : grid.keySet()) {
            stream.print(key);

            if (key % 3 == 0) {
                stream.println();
                stream.println("-----");
            } else {
                stream.print("|");
            }
        }


        //stream.println("1|2|3");
        //stream.println("4|5|6");
        //stream.println("7|8|9");
    }

}
