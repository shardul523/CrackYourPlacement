class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int currMin = prices[0];
        int currMax = prices[0];
        int result = 0;

        for (int price : prices) {
            if (currMin > price) {
                currMin = price;
                currMax = price;
            } else if (currMax < price) {
                currMax = price;
                result = Math.max(result, currMax - currMin);
            }
        }

        return result;
    }
}