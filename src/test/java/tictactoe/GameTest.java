package tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class GameTest {

    @Test
    public void shouldDisplayFirstRowOnStart() {
        PrintStream stream = mock(PrintStream.class);

        Game game = new Game(stream);

        game.displayGrid();

        verify(stream).println("1|2|3");
    }

    @Test
    public void shouldDisplayAllRowsOnStart() {
        PrintStream stream = mock(PrintStream.class);

        Game game = new Game(stream);

        game.displayGrid();

        verify(stream).println("1|2|3");
        verify(stream).println("4|5|6");
        verify(stream).println("7|8|9");
    }


}