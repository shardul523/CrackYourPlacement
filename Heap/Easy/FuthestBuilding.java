package Heap.Easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class FuthestBuilding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int bricksCount = 0;
        PriorityQueue<Integer> minBricks = new PriorityQueue<>(Collections.reverseOrder());

        int i = 1;
        int n = heights.length;

        while (i < n) {
            if (heights[i] < heights[i - 1]) {
                //System.out.println("No cost needed at " + i);
                i++;
                continue;
            }
            int currBricksNeed = heights[i] - heights[i - 1];
            minBricks.add(currBricksNeed);
            bricksCount += currBricksNeed;

            //System.out.println(currBricksNeed + " bricks needed at " + i + "Bricks count " + bricksCount);

            if (bricksCount > bricks) {
                //System.out.println("Ladder needed at " + i);
                if (ladders == 0)
                    return i - 1;
                ladders--;
                bricksCount -= minBricks.poll();
            }

            i++;
        }

        return i - 1;
    }
}
