package Graphs.Easy;

import java.util.ArrayDeque;
import java.util.Queue;

class Coordinates {
    int x;
    int y;

    Coordinates() {
        x = 0;
        y = 0;
    }

    Coordinates(int i, int j) {
        x = i;
        y = j;
    }
}

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Coordinates> visitQueue = new ArrayDeque<>();
        Coordinates start = new Coordinates(sr, sc);
        visitQueue.add(start);
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        while (!visitQueue.isEmpty()) {
            Coordinates curr = visitQueue.poll();

            if (visited[curr.x][curr.y])
                continue;

            visited[curr.x][curr.y] = true;
            image[curr.x][curr.y] = color;

            for (int[] dir : directions) {
                int nextX = curr.x + dir[0];
                int nextY = curr.y + dir[1];

                if (visited[nextX][nextY])
                    continue;

                visitQueue.add(new Coordinates(nextX, nextY));
            }
        }

        return image;
    }
}
