package graph.undirected;

import com.util.AssertArray;
import org.junit.jupiter.api.Test;

public class SurroundedRegionTest {

    @Test
    public void test1()
    {
        char[][] board =new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] expected =new char[][]{{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        SurroundedRegion.solve(board);
        AssertArray.assertCharArrays(expected,board);
    }
    @Test
    public void test2()
    {
        char[][] board =new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','O','O','X'},{'X','O','X','X'}};
        char[][] expected =new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','O','O','X'},{'X','O','X','X'}};
        SurroundedRegion.solve(board);
        AssertArray.assertCharArrays(expected,board);
    }
}
