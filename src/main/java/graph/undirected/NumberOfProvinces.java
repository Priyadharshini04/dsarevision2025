package graph.undirected;

import java.util.LinkedList;
import java.util.Queue;

/*
    https://www.geeksforgeeks.org/problems/number-of-provinces/1
    TC: O(V) + O(V+2E)
    SC: O(V) for visited array+O(V) for dfs traversal
 */
public class NumberOfProvinces {
    public static int findCircleNum(int[][] isConnected) {
        int countProvince = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                countProvince++;
                bfs(isConnected, i, visited);
            }
        }
        return countProvince;
    }

    private static void bfs(int[][] isConnected, int v, boolean[] visited) {
        if (!visited[v]) {
            Queue<Integer> queue=new LinkedList<>();
            queue.offer(v);
            while(!queue.isEmpty())
            {
                int node= queue.poll();
                if(!visited[node])
                {
                    visited[node]=true;
                    for(int i=0;i<isConnected.length;i++)
                    {
                        if(!visited[i] && isConnected[node][i]==1)
                        {
                            queue.offer(i);
                        }
                    }
                }
            }
        }
    }

    private static void dfs(int[][] isConnected, int v, boolean[] visited) {
        if (!visited[v]) {
            visited[v] = true;
            for (int k = 0; k < isConnected.length; k++) {
                if (isConnected[v][k] == 1 && !visited[k]) {
                    dfs(isConnected, k, visited);
                }
            }
        }
    }
}
