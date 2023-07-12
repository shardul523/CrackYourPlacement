package Maths.Easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int totalXOR = 0;

        for (int i = 0; i < nums.length; i++)
            totalXOR ^= nums[i];

        for (int i = 0; i <= nums.length; i++)
            totalXOR ^= i;

        return totalXOR;
    }
}
