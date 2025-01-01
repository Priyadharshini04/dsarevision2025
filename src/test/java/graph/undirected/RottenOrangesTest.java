package graph.undirected;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RottenOrangesTest {
    @Test
    public void test1() {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int result = RottenOranges.orangesRotting(grid);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int[][] grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int result = RottenOranges.orangesRotting(grid);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void test3() {
        int[][] grid = new int[][]{{0, 2}};
        int result = RottenOranges.orangesRotting(grid);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void test4() {
        int[][] grid = new int[][]{{1},{2}};
        int result = RottenOranges.orangesRotting(grid);
        Assertions.assertEquals(1, result);
    }
}
