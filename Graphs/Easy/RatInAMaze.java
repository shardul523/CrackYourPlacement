package Graphs.Easy;

import java.util.ArrayList;

class RatInAMaze {
    static ArrayList<String> paths;
    static boolean[][] visited;
    static byte[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static char[] dirChar = {'R', 'L', 'D', 'U'};

    static void dfs(int[][] g, int i, int j, int n, String curr) {
        if (i >= n || j >= n || i < 0 || j < 0)
            return;
        if (g[i][j] == 0)
            return;
        if (i == n - 1 && j == n - 1) {
            paths.add(curr);
            return;
        }
        if (visited[i][j])
            return;
            
        //System.out.println("At " + i + " " + j);

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int ni = i + dir[k][0];
            int nj = j + dir[k][1];

            // if (visited[ni][nj])
            //     continue;
            dfs(g, ni, nj, n, curr + dirChar[k]);
        }

        visited[i][j] = false;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0)
            return new ArrayList<>();
        
        paths = new ArrayList<>();
        visited = new boolean[n][n];

        dfs(m, 0, 0, n, "");

        return paths;
    }
}