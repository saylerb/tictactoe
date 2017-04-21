package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class GameTest {
    private Game game;
    private Grid grid;
    private PrintStream stream;
    private BufferedReader reader;

    @Before
    public void setup() {
        stream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        grid = mock(Grid.class);
        game = new Game(stream, reader, grid);
    }
    @Test
    public void shouldDisplayGridOnStart() throws IOException {
        when(reader.readLine()).thenReturn("0");

        game.start();

        verify(grid).print();
    }

    @Test
    public void shouldPromptTheUserToEnterNumberOnStart() throws IOException {
        when(reader.readLine()).thenReturn("0");

        game.start();

        verify(stream).println("Please enter a number: ");
    }

    @Test
    public void shouldMutateGridAfterUserMakesSelection() throws IOException {
        when(reader.readLine()).thenReturn("1");

        game.start();

        verify(grid).changeValue(1, "X");
    }
}