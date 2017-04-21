package tictactoe;

import java.io.PrintStream;

public class Game {
    private PrintStream stream;

    public Game(PrintStream stream) {
       this.stream = stream;
    }

    public void displayGrid() {
        stream.println("1|2|3");
        stream.println("4|5|6");
        stream.println("7|8|9");
    }

}
