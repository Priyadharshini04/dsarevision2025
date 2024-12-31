package graph.undirected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
SC: O(degree of node) for Queue + O(N) visited array = O(N)
TC: O(V) + O(total degrees / 2E)
 */
public class BFS {
    public static ArrayList<Integer> traversal(ArrayList<ArrayList<Integer>> adj, int v) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited[node]) {
                result.add(node);
                visited[node] = true;
                for (int j = 0; j < adj.get(node).size(); j++) {
                    int connectedNode = adj.get(node).get(j);
                    if (!visited[connectedNode]) {
                        queue.offer(connectedNode);
                    }
                }
            }
        }
        return result;
    }
}
