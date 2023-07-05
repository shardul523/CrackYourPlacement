import java.util.*;

class ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m) {
        long minDiff = Long.MAX_VALUE;
        Collections.sort(a);

        int left = 0;
        int right = m - 1;

        while (right < n) {
            long diff = (long)a.get(right) - a.get(left);
            if (diff < minDiff)
                minDiff = diff;
            right++;
            left++;
        }

        return minDiff;
    }
}