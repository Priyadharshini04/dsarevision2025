package graph.directed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTwoTest {
    @Test
    public void test1()
    {
        int v=4;
        int[][] edges=new int[][]{{1,0},{2,0},{3,1},{3,2}};
        int[] result=CourseScheduleTwo.findOrder(edges,v);
        int[] expected=new int[]{0,1,2,3};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    public void test2()
    {
        int v=4;
        int[][] edges=new int[][]{{0,3},{1,0},{2,0},{3,1},{3,2}};
        int[] result=CourseScheduleTwo.findOrder(edges,v);
        int[] expected=new int[]{};
        Assertions.assertArrayEquals(expected,result);
    }
    @Test
    public void test3()
    {
        int v=4;
        int[][] edges=new int[][]{{3,1},{3,2}};
        int[] result=CourseScheduleTwo.findOrder(edges,v);
        int[] expected=new int[]{0,1,2,3};
        Assertions.assertArrayEquals(expected,result);
    }
}
