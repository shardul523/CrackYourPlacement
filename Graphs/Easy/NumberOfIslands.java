package Graphs.Easy;

public class NumberOfIslands {
    boolean[][] visited;

    void dfs(char[][] g, int i, int j) {
        int m = g.length;
        int n = g[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n)
            return;

        if (visited[i][j] || g[i][j] == '0')
            return;

        visited[i][j] = true;

        for (int k = -1; k < 2; k += 2) {
            dfs(g, i + k, j);
            dfs(g, i, j + k);
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || grid[i][j] == '0')
                    continue;
                dfs(grid, i, j);
                res++;
            }
        }

        return res;
    }
}
