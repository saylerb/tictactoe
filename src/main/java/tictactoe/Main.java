package tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(System.out);
        GameRunning gameRunning = new GameRunning();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game(System.out, reader, grid, gameRunning);

        game.start();
    }
}
