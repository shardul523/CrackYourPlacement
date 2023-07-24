package DP.Easy;

class MaxProdSubarray {
    public int maxProduct(int[] nums) {
        int minProd = 1;
        int maxProd = 1;
        int res = nums[0];

        for (int n : nums) {
            int newMinProd = Math.min(n, Math.min(minProd * n, maxProd * n));
            int newMaxProd = Math.max(n, Math.max(minProd * n, maxProd * n));
            minProd = newMinProd;
            maxProd = newMaxProd;
            // System.out.println(maxProd + " " + minProd);
            res = Math.max(res, Math.max(minProd, maxProd));
        }

        return res;
    }
}