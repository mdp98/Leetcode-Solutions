class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) {
            return 0;
        }
        int minimumPriceSoFar = prices[0];
        int maxProfit = 0;
        for(int iterator = 1; iterator < prices.length; iterator++) {
            if(prices[iterator] < minimumPriceSoFar) {
                minimumPriceSoFar = prices[iterator];
            } else {
                maxProfit = maxProfit < prices[iterator] - minimumPriceSoFar ? prices[iterator] - minimumPriceSoFar : maxProfit;
            }
        }
        return maxProfit;
    }
}