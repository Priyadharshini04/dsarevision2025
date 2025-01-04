package graph.undirected;

import com.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
/*
https://leetcode.com/problems/flood-fill/
SC: O(N*M) + O(N*M)
TC: O(4*N*M) + O(N*M)
Can be solved using DFS as well.
 */
public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> queue=new LinkedList<>();
        int initialColor = image[sr][sc];
        queue.offer(new Pair(sr,sc));
        int[][] result = new int[image.length][image[0].length];
        boolean[][] visited=new boolean[image.length][image[0].length];
        result[sr][sc]=color;
        visited[sr][sc]=true;
        while(!queue.isEmpty())
        {
            Pair p = queue.poll();
            int row=p.getRow(); int col=p.getCol();
            int up=row-1; int down=row+1;
            int left=col-1; int right=col+1;
            if(up>=0 && image[up][col]==initialColor && !visited[up][col])
            {
                queue.offer(new Pair(up,col));
                visited[up][col]=true;
                result[up][col]=color;
            }
            if(down< image.length && image[down][col]==initialColor && !visited[down][col])
            {
                queue.offer(new Pair(down,col));
                visited[down][col]=true;
                result[down][col]=color;
            }
            if(left>=0 && image[row][left]==initialColor && !visited[row][left])
            {
                queue.offer(new Pair(row,left));
                visited[row][left]=true;
                result[row][left]=color;
            }
            if(right<image[0].length && image[row][right]==initialColor && !visited[row][right]) {
                queue.offer(new Pair(row, right));
                visited[row][right] = true;
                result[row][right] = color;
            }
        }
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited[0].length;j++)
            {
                if(!visited[i][j])
                {
                    result[i][j]=image[i][j];
                }
            }
        }
        return result;
    }
}
