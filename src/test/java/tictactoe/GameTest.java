package tictactoe;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDisplayGridOnStart() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);

        Grid grid = mock(Grid.class);
        Game game = new Game(stream, reader, grid);

        when(reader.readLine()).thenReturn("0");
        game.start();

        verify(grid).print();
    }

    @Test

    public void shouldPromptTheUserToEnterNumberOnStart() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);

        Grid grid = new Grid(stream);
        Game game = new Game(stream, reader, grid);

        when(reader.readLine()).thenReturn("0");

        game.start();

        verify(stream).println("Please enter a number: ");
    }

    @Test
    public void shouldDrawUserSelectionToGrid() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);
        Grid grid = new Grid(stream);
        Game game = new Game(stream, reader, grid);

        when(reader.readLine()).thenReturn("1");

        game.start();

        verify(stream).print("X");
    }


}