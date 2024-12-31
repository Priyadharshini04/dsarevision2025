package graph.undirected;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfProvincesTest {
    @Test
    public void test1()
    {
        int[][] isConnected = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
        assertEquals(2,NumberOfProvinces.findCircleNum(isConnected));
    }
}
