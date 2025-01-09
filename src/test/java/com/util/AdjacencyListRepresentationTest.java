package com.util;

import org.junit.jupiter.api.Test;

public class AdjacencyListRepresentationTest {
    @Test
    public void test1()
    {
        int[][] edges = new int[][]
                {{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
        new AdjacencyListRepresentation().getAdjacent(edges,5, GraphType.UnDirected);
    }
}
