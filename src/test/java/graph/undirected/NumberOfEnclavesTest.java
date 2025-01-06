package graph.undirected;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfEnclavesTest {
    @Test
    public void test1()
    {
        int[][] grid = new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        int result=NumberOfEnclaves.numEnclaves(grid);
        Assertions.assertEquals(3,result);
    }
    @Test
    public void test2()
    {
        int[][] grid = new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        int result=NumberOfEnclaves.numEnclaves(grid);
        Assertions.assertEquals(0,result);
    }
}
