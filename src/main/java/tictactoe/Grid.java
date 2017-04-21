package tictactoe;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Grid {
    private Map<Integer, String> grid;
    private PrintStream stream;

    public Grid(PrintStream stream) {
        this.grid = buildGrid();
        this.stream = stream;
    }

    private Map<Integer, String> buildGrid() {
        return new HashMap<Integer, String>() {
            {
                put(1, "1");
                put(2, "2");
                put(3, "3");
                put(4, "4");
                put(5, "5");
                put(6, "6");
                put(7, "7");
                put(8, "8");
                put(9, "9");
            }
        };
    }

    public void changeValue(Integer key, String value) {
        grid.put(key, value);
    }

    public Set<Integer> getAllGridPositions() {
       return grid.keySet();
    }

    public String getValueAtGridPosition(Integer key) {
        return grid.get(key);
    }

    public void print() {
        for (Integer key : getAllGridPositions()) {
            stream.print(getValueAtGridPosition(key));

            if (key % 3 == 0) {
                stream.println();
                stream.println("-----");
            } else {
                stream.print("|");
            }
        }
    }
}
