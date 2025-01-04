package graph.undirected;

import com.util.ParentPair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
TC: O(V+2E) + O(V)
SC: O(V) + O(V)
*/
public class CyclicGraphBfs {

    public static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList) {
        int v=adjList.size();
        boolean[] visited=new boolean[v];
        Queue<ParentPair> pairs=new LinkedList<>();
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                pairs.offer(new ParentPair(i,i));
                while(!pairs.isEmpty()){
                    ParentPair pair=pairs.poll();
                    int node=pair.getNode();
                    if(!visited[node]) {
                        visited[node]=true;
                        int parentNode = pair.getParentNode();
                        for (int j = 0; j < adjList.get(node).size(); j++) {
                            int newNode = adjList.get(node).get(j);
                            if (!visited[newNode]) {
                                pairs.offer(new ParentPair(newNode,node));
                            }
                            else if(newNode!=parentNode)
                            {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
