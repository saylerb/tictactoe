package tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(System.out, new BufferedReader(new InputStreamReader(System.in)));

        game.start();
    }
}
