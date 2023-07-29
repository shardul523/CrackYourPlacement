package Greedy.Easy;

import java.util.Arrays;
import java.util.Comparator;

class Two2DComp implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return a[1] - b[1];
    }
}

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Two2DComp());
        int length = intervals.length;
        int prevEnd = Integer.MIN_VALUE;
        int erasures = 0;

        for (int i = 0; i < length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart >= prevEnd)
                prevEnd = currEnd;
            else
                erasures++;
        }

        return erasures;
    }
}