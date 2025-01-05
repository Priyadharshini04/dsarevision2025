package graph.undirected;

import com.util.AssertArray;
import org.junit.jupiter.api.Test;

public class NearestZeroTest {
    @Test
    public void test1()
    {
        int[][] matrix=new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] expected=new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] result = NearestZero.updateMatrix(matrix);
        AssertArray.assertIntArrays(expected,result);
    }

    @Test
    public void test2()
    {
        int[][] matrix=new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        int[][] expected=new int[][]{{0,0,0},{0,1,0},{1,2,1}};
        int[][] result = NearestZero.updateMatrix(matrix);
        AssertArray.assertIntArrays(expected,result);
    }
}
