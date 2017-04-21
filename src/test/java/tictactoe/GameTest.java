package tictactoe;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameTest {

    @Test
    public void shouldDisplayAllRowsOnStart() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);

        Game game = new Game(stream, reader);

        when(reader.readLine()).thenReturn("0");
        game.start();

        verify(stream, times(3)).println();
        verify(stream, times(6)).print("|");
    }

    @Test

    public void shouldPromptTheUserToEnterNumberOnStart() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);

        Game game = new Game(stream, reader);

        when(reader.readLine()).thenReturn("0");

        game.start();

        verify(stream).println("Please enter a number: ");
    }

    @Test
    public void shouldDrawUserSelectionToGrid() throws IOException {
        PrintStream stream = mock(PrintStream.class);
        BufferedReader reader = mock(BufferedReader.class);
        Game game = new Game(stream, reader);

        when(reader.readLine()).thenReturn("1");

        game.start();

        verify(stream).print("X");
    }


}