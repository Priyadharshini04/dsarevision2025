package graph.directed;

import com.util.AdjacencyListRepresentation;
import com.util.GraphType;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleTwo {
    public static int[] findOrder(int[][] edges,int v) {
        List<List<Integer>> adjList= AdjacencyListRepresentation.getAdjacent(edges,v, GraphType.Directed);
        boolean[] visited=new boolean[v];
        boolean[] pathVisited=new boolean[v];
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                if(dfs(adjList,visited,pathVisited,i,result))
                {
                    return new int[]{};
                }
            }
        }
        int[] resultArr=new int[result.size()];
        for(int i=0;i<resultArr.length;i++)
        {
            resultArr[i]=result.get(i);
        }
        return resultArr;
    }

    private static boolean dfs(List<List<Integer>> adjList, boolean[] visited, boolean[] pathVisited, int v, ArrayList<Integer> result) {
        if(!visited[v])
        {
            visited[v]=true;
            pathVisited[v]=true;
            for(int i=0;i<adjList.get(v).size();i++)
            {
                int node=adjList.get(v).get(i);
                if(dfs(adjList, visited, pathVisited, node, result))
                {
                    return true;
                }
            }
            pathVisited[v]=false;
            result.add(v);
        }
        else if(pathVisited[v])
        {
            return true;
        }
        return false;
    }
}
