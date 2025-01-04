package graph.undirected;

import com.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
/*
https://leetcode.com/problems/rotting-oranges/
TC: O(N*M)+O(4*N*M)
SC: O(N*M)+O(N*M)
 */
public class RottenOranges {

    public static int orangesRotting(int[][] grid) {
        int[][] rottenTime = new int[grid.length][grid[0].length];
        Queue<Pair> rottenPair = new LinkedList<>();
        int result = -1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 2) {
                    rottenPair.offer(new Pair(row, col));
                    rottenTime[row][col] = 0;
                } else if (grid[row][col] == 1) {
                    rottenTime[row][col] = -1;
                }
            }
        }
        while (!rottenPair.isEmpty()) {
            Pair rotten = rottenPair.poll();
            int row = rotten.getRow();
            int col = rotten.getCol();
            int time = rotten.getTime();
            int up = row - 1;
            int down = row + 1;
            int left = col - 1;
            int right = col + 1;
            if (up >= 0 && grid[up][col] == 1 && (rottenTime[up][col] == -1 || rottenTime[up][col] > time + 1)) {
                rottenPair.offer(new Pair(up,col,time+1));
                rottenTime[up][col]=time+1;
            }
            if (down <grid.length && grid[down][col] == 1 && (rottenTime[down][col] == -1 || rottenTime[down][col] > time + 1)) {
                rottenPair.offer(new Pair(down,col,time+1));
                rottenTime[down][col]=time+1;
            }
            if (left >= 0 && grid[row][left] == 1 && (rottenTime[row][left] == -1 || rottenTime[row][left] > time + 1)) {
                rottenPair.offer(new Pair(row,left,time+1));
                rottenTime[row][left]=time+1;
            }
            if (right <grid[0].length && grid[row][right] == 1 && (rottenTime[row][right] == -1 || rottenTime[row][right] > time + 1)) {
                rottenPair.offer(new Pair(row,right,time+1));
                rottenTime[row][right]=time+1;
            }
        }
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (rottenTime[row][col] == -1) {
                    return -1;
                }
                result=Math.max(result,rottenTime[row][col]);
            }
        }
        return result;
    }
}