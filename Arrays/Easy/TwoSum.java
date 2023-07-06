import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> complement = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (complement.containsKey(diff)) {
                result[0] = i;
                result[1] = complement.get(diff);
                break;
            }

            complement.put(nums[i], i);
        }

        return result;
    }
}
