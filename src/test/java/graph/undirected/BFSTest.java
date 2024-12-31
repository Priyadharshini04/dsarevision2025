package graph.undirected;

import com.util.AssertArrayList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BFSTest {
    @Test
    public void test1()
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<>(List.of(2,3,1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(0,4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 2, 3, 1, 4));
        ArrayList<Integer> result = BFS.traversal(adj,5);
        new AssertArrayList<Integer>().assertArrayList(expected,result);
    }
}
