package graph.undirected;

/*
https://leetcode.com/problems/surrounded-regions/
TC: O(N*M)+O(N*M*4)+O(N)+O(M)
SC: O(N*M) + O(N*M)
 */
public class SurroundedRegion {
    public static void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i, visited);
            }
            if (board[board.length - 1][i] == 'O') {
                dfs(board, board.length - 1, i, visited);
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0, visited);
            }
            if (board[i][board[0].length - 1] == 'O') {
                dfs(board, i, board[0].length - 1, visited);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void dfs(char[][] board, int row, int col, boolean[][] visited) {
        if (!visited[row][col]) {
            visited[row][col] = true;
            int up = row - 1;
            int down = row + 1;
            int left = col - 1;
            int right = col + 1;
            if (up >= 0 && !visited[up][col] && board[up][col] == 'O') {
                dfs(board, up, col, visited);
            }
            if (down < board.length && !visited[down][col] && board[down][col] == 'O') {
                dfs(board, down, col, visited);
            }
            if (left >= 0 && !visited[row][left] && board[row][left] == 'O') {
                dfs(board, row, left, visited);
            }
            if (right < board[0].length && !visited[row][right] && board[row][right] == 'O') {
                dfs(board, row, right, visited);
            }
        }
    }
}
