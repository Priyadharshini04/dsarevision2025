package graph.undirected;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListRepresentation {
    // SC: O(V+E)
    // TC: Building O(V+E) update O(E) , edge checking O(degree of node) , edges for particular node O(degree of node)
    // Edge add : O(1) delete O(degree of node) , vertex Addition O(1) , Deletion Vertex: O(degree of node)
    // Degree of node: Number of edges incident to the node
    public static  List<List<Integer>> getAdjacent(int[][] edges, int v) {
        List<List<Integer>> adjacent = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adjacent.add( new ArrayList<>() );
        }
        for(int i=0;i<edges.length;i++)
        {
            int node1=edges[i][0];
            int node2=edges[i][1];
            adjacent.get(node1).add(node2);
            adjacent.get(node2).add(node1);
        }
       // printAdjacentList(adjacent);
        return adjacent;
    }
    static void printAdjacentList(List<List<Integer>> adjList)
    {
        for(int i=0;i<adjList.size();i++)
        {
            System.out.print(i+" => ");
            for(int j=0;j<adjList.get(i).size();j++)
            {
                System.out.print(adjList.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }
}
