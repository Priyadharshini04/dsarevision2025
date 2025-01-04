package graph.undirected;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CyclicGraphDFSTest {
    @Test
    public void test1()
    {
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        adjList.add(new ArrayList<>(List.of(1)));
        adjList.add(new ArrayList<>(List.of(0,2,4)));
        adjList.add(new ArrayList<>(List.of(1,3)));
        adjList.add(new ArrayList<>(List.of(2,4)));
        adjList.add(new ArrayList<>(List.of(1,3)));
        Assertions.assertTrue(CyclicGraphDFS.isCyclic(adjList));
    }
    @Test
    public void test2()
    {
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        adjList.add(new ArrayList<>());
        adjList.add(new ArrayList<>(List.of(2)));
        adjList.add(new ArrayList<>(List.of(1,3)));
        adjList.add(new ArrayList<>(List.of(2)));
        Assertions.assertFalse(CyclicGraphDFS.isCyclic(adjList));
    }
}
