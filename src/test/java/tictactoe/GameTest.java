package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameTest {
    private Game game;
    private Grid grid;
    private PrintStream stream;
    private BufferedReader reader;
    private GameRunning gameRunning;

    @Before
    public void setup() {
        stream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        grid = mock(Grid.class);
        gameRunning = mock(GameRunning.class);
        game = new Game(stream, reader, grid, gameRunning);
    }

    @Test
    public void shouldDisplayGridOnStart() throws IOException {
        when(reader.readLine()).thenReturn("0");

        when(gameRunning.isRunning()).thenReturn(true).thenReturn(false);

        game.start();

        verify(grid).print();
    }

    @Test
    public void shouldPromptThePlayerToEnterNumberOnStart() throws IOException {
        when(reader.readLine()).thenReturn("0");

        when(gameRunning.isRunning()).thenReturn(true).thenReturn(false);

        game.start();

        verify(stream).println("Player 1 please enter a number: ");
    }

    @Test
    public void shouldMutateGridAfterUserMakesSelection() throws IOException {
        when(reader.readLine()).thenReturn("1");

        when(gameRunning.isRunning()).thenReturn(true).thenReturn(false);

        game.start();

        verify(grid).changeValue(1, "X");
    }

    @Test
    public void shouldAskForInputAfterPlayer1MakesSelection() throws IOException {
        when(reader.readLine()).thenReturn("1");

        when(gameRunning.isRunning()).thenReturn(true).thenReturn(true).thenReturn(false);

        game.start();

        verify(stream).println("Player 2 please enter a number: ");
    }

    @Test
    public void shouldMutateGridAfterPlayerTwoMakesSelection() throws IOException {
        when(reader.readLine()).thenReturn("1").thenReturn("2");
        when(gameRunning.isRunning()).thenReturn(true).thenReturn(true).thenReturn(false);

        game.start();

        verify(grid).changeValue(1, "X");
        verify(grid).changeValue(2, "O");
    }
}