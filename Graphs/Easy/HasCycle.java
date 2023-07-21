package Graphs.Easy;

import java.util.ArrayList;

class HasCycle {
    boolean[] visited;
    boolean hasLoop = false;

    void dfs(int i, int prev, ArrayList<ArrayList<Integer>> g) {
        if (visited[i]) {
            hasLoop = true;
            return;
        }

        visited[i] = true;

        for (int j : g.get(i)) {
            if (j == prev)
                continue;
            dfs(j, i, g);
        }

        return;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (visited[i])
                continue;
            dfs(i, -1, adj);
        }

        return hasLoop;
    }
}