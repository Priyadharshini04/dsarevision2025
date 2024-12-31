package graph.undirected;


import org.junit.jupiter.api.Test;

public class MatrixRepresentationTest {
    @Test
    public void test1()
    {
        int[][] edges = new int[][]
                {{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
        new MatrixRepresentation().printMatrixRepresentation(edges,5);
    }
}
