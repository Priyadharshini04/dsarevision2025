package graph.undirected;
/*
https://leetcode.com/problems/is-graph-bipartite/description/
SC: O(V)+O(V)
TC: O(V+2E)
 */
public class Bipartite {
    public static boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        for(int i=0;i< graph.length;i++)
        {
            if(color[i]==0)
            {
                boolean isBipartite=true;
                isBipartite = splitBasedOnColorDFS(graph,color,i,1);
                if(!isBipartite) return false;
            }
        }
        return true;
    }

    private static boolean splitBasedOnColorDFS(int[][] graph, int[] color,int v,int currentColor) {
        if(color[v]==0)
        {
            color[v]=currentColor;
            for(int j=0;j<graph[v].length;j++)
            {
                int node=graph[v][j];
                if(color[node]==0)
                {
                    if(!splitBasedOnColorDFS(graph,color,node,currentColor==1?2:1)) return false;
                }
                else if(color[node]==currentColor)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
