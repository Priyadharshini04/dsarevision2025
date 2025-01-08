package graph.undirected;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BipartiteTest {
    @Test
    public void test1() {
        int[][] graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        Assertions.assertFalse(Bipartite.isBipartite(graph));
    }

    @Test
    public void test2() {
        int[][] graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        Assertions.assertTrue(Bipartite.isBipartite(graph));
    }

    @Test
    public void test3() {
        int[][] graph = new int[][]{{1, 5}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {0, 4}};
        Assertions.assertTrue(Bipartite.isBipartite(graph));
    }

    @Test
    public void test4() {
        int[][] graph = new int[][]{{}, {2, 4, 6}, {1, 4, 8, 9}, {7, 8}, {1, 2, 8, 9}, {6, 9}, {1, 5, 7, 8, 9}, {3, 6, 9}, {2, 3, 4, 6, 9}, {2, 4, 5, 6, 7, 8}};
        Assertions.assertFalse(Bipartite.isBipartite(graph));
    }

    @Test
    public void test5() {
        int[][] graph = new int[][]{{3, 4, 6}, {3, 6}, {3, 6}, {0, 1, 2, 5}, {0, 7, 8}, {3}, {0, 1, 2, 7}, {4, 6}, {4}, {}};
        Assertions.assertTrue(Bipartite.isBipartite(graph));
    }

    @Test
    public void test6() {
        int[][] graph = new int[][]{{2, 3, 5, 6, 7, 8, 9}, {2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 6, 9}, {0, 1, 2, 3, 7, 8, 9}, {0, 1, 2, 3, 4, 7, 8, 9}, {0, 1, 2, 3, 5, 6, 8, 9}, {0, 1, 2, 3, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}};
        Assertions.assertFalse(Bipartite.isBipartite(graph));
    }
}
