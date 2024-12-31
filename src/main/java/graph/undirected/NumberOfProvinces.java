package graph.undirected;

public class NumberOfProvinces {
    public static int findCircleNum(int[][] isConnected) {
        int countProvince = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                countProvince++;
                dfs(isConnected, i, visited);
            }
        }
        return countProvince;
    }

    private static void dfs(int[][] isConnected, int v, boolean[] visited) {
        if (!visited[v]) {
            visited[v] = true;
            for (int k = 0; k < isConnected.length; k++) {
                if (isConnected[v][k] == 1 && !visited[k]) {
                    dfs(isConnected, k, visited);
                }
            }
        }
    }
}
