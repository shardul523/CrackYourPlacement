import java.util.Arrays;

// Using a slight variation of the problem in the sheet

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        int n = nums.length;
        if (n < 2)
            return 0;

        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int countPairs = 0;

        Integer prev_i = null;

        while (i < j && j < n) {
            if (nums[j] - nums[i] < k)
                j++;
            else if (nums[j] - nums[i] > k)
                i++;
            else {
                if (prev_i == null || prev_i != nums[i]) {
                    countPairs++;
                    prev_i = nums[i];
                }
                i++;
                j++;
            }

            j = Math.max(i + 1, j);
        }

        return countPairs;
    }
}
