package Graphs.Easy;

import java.util.ArrayList;

public class GraphDFS {
    ArrayList<Integer> dfsList;
    boolean[] visited;

    void dfs(ArrayList<ArrayList<Integer>> graph, int node) {
        if (visited[node])
            return;

        visited[node] = true;
        dfsList.add(node);

        for (int neighbour : graph.get(node))
            if (!visited[neighbour])
                dfs(graph, neighbour);
    }

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];
        dfsList = new ArrayList<>();
        dfs(adj, 0);

        return dfsList;
    }
}
