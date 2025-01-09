package graph.directed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CycleDetectionTest {
    @Test
    public void test1()
    {
        int v=4;
        int[][] edges=new int[][]{{1,0},{2,0},{3,1},{3,2}};
        Assertions.assertFalse(CycleDetection.isCyclic(edges,v));
    }

    @Test
    public void test2()
    {
        int v=4;
        int[][] edges=new int[][]{{0,3},{1,0},{2,0},{3,1},{3,2}};
        Assertions.assertTrue(CycleDetection.isCyclic(edges,v));
    }
}
