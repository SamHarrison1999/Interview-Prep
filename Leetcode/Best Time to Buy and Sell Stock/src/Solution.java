class Solution {
    public int maxProfit(int[] prices) {
        // use the minimum price visited so far to find the max profit
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
            if (prices[i] < minPrice)
                minPrice = prices[i];
        }
        return maxProfit;
    }
}