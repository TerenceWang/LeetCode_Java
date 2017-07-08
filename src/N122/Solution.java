package N122;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            profit = Math.max(0,prices[i+1]-prices[i])+profit;
        }
        return profit;
    }
}
