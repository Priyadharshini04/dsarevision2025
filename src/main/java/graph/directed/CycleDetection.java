package graph.directed;

import com.util.AdjacencyListRepresentation;
import com.util.GraphType;

import java.util.List;

public class CycleDetection {
    public static boolean isCyclic(int[][] edges, int v) {
        boolean result=false;
        List<List<Integer>> adjList= AdjacencyListRepresentation.getAdjacent(edges,v, GraphType.Directed);
        boolean[] visited=new boolean[v];
        boolean[] pathVisited=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                if(dfs(adjList,visited,pathVisited,i))
                {
                    return true;
                }
            }
        }
        return result;
    }

    private static boolean dfs(List<List<Integer>> adjList, boolean[] visited, boolean[] pathVisited, int v) {
        if(!visited[v])
        {
            visited[v]=true;
            pathVisited[v]=true;
            for(int i=0;i<adjList.get(v).size();i++)
            {
                int node=adjList.get(v).get(i);

                if(dfs(adjList,visited,pathVisited,node)) return true;
            }
            pathVisited[v]=false;
        }
        else if(pathVisited[v])
        {
            return true;
        }
        return false;
    }
}
