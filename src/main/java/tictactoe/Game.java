package tictactoe;

import java.io.PrintStream;

public class Game {
    private PrintStream stream;

    public Game(PrintStream stream) {
       this.stream = stream;
    }

    public void displayGrid() {
        stream.println("1|2|3");
    }

}
