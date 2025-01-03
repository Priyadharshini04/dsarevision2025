package graph.undirected;

import org.junit.jupiter.api.Test;

import static com.util.AssertArray.assertArrays;

public class FloodFillTest {
    @Test
    public void test1()
    {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] expected = new int[][]{{2,2,2},{2,2,0},{2,0,1}};
        int[][] result = FloodFill.floodFill(image,sr,sc,color);
        assertArrays(expected,result);
    }

    @Test
    public void test2()
    {
        int[][] image = {{0,0,0},{0,0,0}};
        int sr = 1, sc = 1, color = 0;
        int[][] expected = new int[][]{{0,0,0},{0,0,0}};
        int[][] result = FloodFill.floodFill(image,sr,sc,color);
        assertArrays(expected,result);
    }

    @Test
    public void test3()
    {
        int[][] image = {{0,0,0},{0,1,0}};
        int sr = 1, sc = 1, color = 2;
        int[][] expected = new int[][]{{0,0,0},{0,2,0}};
        int[][] result = FloodFill.floodFill(image,sr,sc,color);
        assertArrays(expected,result);
    }
}
