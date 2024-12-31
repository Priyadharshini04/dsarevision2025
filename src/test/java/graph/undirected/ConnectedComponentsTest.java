package graph.undirected;

import java.util.List;
import com.util.AssertArrayList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/connected-components-in-an-undirected-graph/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class ConnectedComponentsTest {
    @Test
    public void test1()
    {
        int[][] edges = new int[][]{{0, 1},{2, 1},{3, 4}};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0, 1, 2)));
        expected.add(new ArrayList<>(List.of(3, 4)));
        ArrayList<ArrayList<Integer>> result = ConnectedComponents.findConnected(edges,5);
        new AssertArrayList<Integer>().assertArrayLists(expected,result);
    }
}
