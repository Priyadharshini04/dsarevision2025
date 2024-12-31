package graph.undirected;

import java.util.ArrayList;

/*
https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
SC: O(N) for visited + O(N+2E) for traversal
TC: O(N+2E)
 */
public class DFS {
    public static ArrayList<Integer> traversal(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, result);
            }
        }
        return result;
    }

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        if (!visited[v]) {
            visited[v] = true;
            result.add(v);
            for (int i = 0; i < adj.get(v).size(); i++) {
                int node = adj.get(v).get(i);
                if (!visited[node]) {
                    dfs(node, adj, visited, result);
                }
            }
        }
    }
}
