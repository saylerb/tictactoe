package tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class GameTest {

    @Test
    public void shouldDisplayAllRowsOnStart() {
        PrintStream stream = mock(PrintStream.class);

        Game game = new Game(stream);

        game.start();

        verify(stream, times(3)).println();
        verify(stream, times(6)).print("|");
    }

    @Test

    public void shouldPromptTheUserToEnterNumberOnStart() {
        PrintStream stream = mock(PrintStream.class);

        Game game = new Game(stream);

        game.start();

        verify(stream).println("Please enter a number: ");
    }



}