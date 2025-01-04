package graph.undirected;

import java.util.ArrayList;
/*
https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
TC: O(V+2E) + O(V)
SC: O(V) + O(V)
 */
public class CyclicGraphDFS {
    public static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList) {
        int v=adjList.size();
        boolean[] visited=new boolean[v];
        boolean[] isCyclic=new boolean[1];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                dfs(adjList,visited,i,i,isCyclic);
                if(isCyclic[0])
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int node, int parent, boolean[] isCyclic) {
        if(!visited[node])
        {
            visited[node]=true;
            for(int i=0;i< adjList.get(node).size();i++)
            {
                int newNode = adjList.get(node).get(i);
                if(!visited[newNode])
                {
                    dfs(adjList, visited, newNode, node, isCyclic);
                }
                else if(parent!= newNode)
                {
                    isCyclic[0]=true;
                    return;
                }
            }
        }
    }
}
