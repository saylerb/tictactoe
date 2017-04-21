package tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

public class GameTest {

    @Test
    public void shouldCallDisplayGridMethodOnStart() {

        PrintStream stream = mock(PrintStream.class);

        Game game = new Game(stream);

        verify(game).displayGrid();
    }
}