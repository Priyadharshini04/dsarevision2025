package graph.undirected;

import com.util.AdjacencyListRepresentation;
import com.util.GraphType;

import java.util.*;

//https://www.geeksforgeeks.org/problems/connected-components-in-an-undirected-graph/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
/*
    SC: O(V+E)
    TC: O(V+E) log V
 */
public class ConnectedComponents {
    public static ArrayList<ArrayList<Integer>> findConnected(int[][] edges, int v) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        List<List<Integer>> adj = AdjacencyListRepresentation.getAdjacent(edges, v, GraphType.UnDirected);
        boolean[] visited = new boolean[v];
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                ArrayList<Integer> connected = new ArrayList<>();
                bfs(adj, visited, i, connected);
                Collections.sort(connected);
                result.add(connected);
            }
        }
        return result;
    }

    public static void bfs(List<List<Integer>> adj, boolean[] visited, int v, ArrayList<Integer> connected) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited[node]) {
                connected.add(node);
                visited[node]=true;
                for (int i = 0; i < adj.get(node).size(); i++) {
                    int connectedNode = adj.get(node).get(i);
                    if (!visited[connectedNode]) {
                        queue.add(connectedNode);
                    }
                }
            }
        }
    }

    public static void dfs(List<List<Integer>> adj, boolean[] visited, int v, ArrayList<Integer> connected) {
        if (!visited[v]) {
            connected.add(v);
            visited[v] = true;
            for (int i = 0; i < adj.get(v).size(); i++) {
                int node = adj.get(v).get(i);
                if (!visited[node]) {
                    dfs(adj, visited, node, connected);
                }
            }
        }
    }
}
