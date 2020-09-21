class Solution {
    public int maxProfit(int[] prices) {
         if(prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);//今天卖出的最大利润
            min = Math.min(min, prices[i]);//今天之前买入的最小值
        }
        return max;
    }
}
