package graph.undirected;
/*
https://leetcode.com/problems/number-of-enclaves/description/
TC: O(N)+O(M)+O(N*M*4)+O(N*M)
SC: O(N*M)+O(N*M)
 */
public class NumberOfEnclaves {
    public static int numEnclaves(int[][] grid) {
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
                dfs(grid, visited, i, 0);
            }
            if (grid[i][grid[0].length - 1] == 1 && !visited[i][grid[0].length]) {
                dfs(grid, visited, i, grid[0].length - 1);
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == 1 && !visited[0][i]) {
                dfs(grid, visited, 0, i);
            }
            if (grid[grid.length - 1][i] == 1 && !visited[grid.length - 1][i]) {
                dfs(grid, visited, grid.length - 1, i);
            }
        }
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited[0].length;j++)
            {
                if(!visited[i][j] && grid[i][j]==1)
                {
                    result++;
                }
            }
        }
        return result;
    }

    public static void dfs(int[][] grid, boolean[][] visited, int row, int col) {
        if (!visited[row][col]) {
            visited[row][col] = true;
            int up = row - 1;
            int down = row + 1;
            int left = col - 1;
            int right = col + 1;
            if (up >= 0 && grid[up][col] == 1 && !visited[up][col]) {
                dfs(grid, visited, up, col);
            }
            if (down < grid.length && grid[down][col] == 1 && !visited[down][col]) {
                dfs(grid, visited, down, col);
            }
            if (right < grid[0].length && grid[row][right] == 1 && !visited[row][right]) {
                dfs(grid, visited, row, right);
            }
            if (left >= 0 && grid[row][left] == 1 && !visited[row][left]) {
                dfs(grid, visited, row, left);
            }
        }
    }
}
