package tictactoe;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GridTest {

    @Test
    public void shouldDisplayAllRowsWhenPrinting() throws IOException {
        PrintStream stream = mock(PrintStream.class);

        Grid grid = new Grid(stream);

        grid.print();

        verify(stream, times(3)).println();
        verify(stream, times(6)).print("|");
    }

}