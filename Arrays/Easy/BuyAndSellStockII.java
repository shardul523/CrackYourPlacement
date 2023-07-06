public class BuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] buyState = new int[n];
        int[] sellState = new int[n];

        buyState[0] -= prices[0];

        for (int i = 1; i < n; i++) {
            buyState[i] = Math.max(sellState[i - 1] - prices[i], buyState[i - 1]);
            sellState[i] = Math.max(buyState[i - 1] + prices[i], sellState[i - 1]);
        }

        return Math.max(buyState[n - 1], sellState[n - 1]);
    }
}

// Can be further optimized for space