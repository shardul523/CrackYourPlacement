package Maths.Easy;
import java.util.*;


public class ThreeNumbersProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int firstTwoProduct = nums[0] * nums[1] * nums[2];
        int lastThreeProduct = 1;
        for (int i = 1; i <= 3; i++) lastThreeProduct *= nums[n - i];

        return Math.max(lastThreeProduct, firstTwoProduct);
    }
}
