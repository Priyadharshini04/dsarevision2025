package graph.undirected;

import com.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/01-matrix/description/
TC: O(4*N*M)+O(N*M)
SC: O(N*M)
 */
public class NearestZero {
    public static int[][] updateMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new Pair(i, j));
                    result[i][j] = 0;
                } else {
                    result[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int row = p.getRow();
            int col = p.getCol();
            int distance = p.getTime()+1;
            int up=row-1; int down=row+1;
            int left=col-1; int right=col+1;
            if(up>=0 && (result[up][col]==-1))
            {
                queue.offer(new Pair(up,col,distance));
                result[up][col]=distance;
            }
            if(down<matrix.length && (result[down][col]==-1))
            {
                queue.offer(new Pair(down,col,distance));
                result[down][col]=distance;
            }
            if(left>=0 && (result[row][left]==-1))
            {
                queue.offer(new Pair(row,left,distance));
                result[row][left]=distance;
            }
            if(right<matrix[0].length && (result[row][right]==-1))
            {
                queue.offer(new Pair(row,right,distance));
                result[row][right]=distance;
            }
        }
        return result;
    }
}
