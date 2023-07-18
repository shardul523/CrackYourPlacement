package Graphs.Easy;

import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

class GraphBFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> visitQueue = new ArrayDeque<Integer>();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];

        visitQueue.add(0);

        while (!visitQueue.isEmpty()) {
            int curr = visitQueue.poll();

            if (visited[curr])
                continue;

            visited[curr] = true;

            bfs.add(curr);

            for (int child : adj.get(curr))
                if (!visited[child])
                    visitQueue.add(child);
        }

        return bfs;
    }
}