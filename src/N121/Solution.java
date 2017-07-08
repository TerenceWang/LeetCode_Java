package N121;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length==0)
            return profit;
        int buypid = 0;
        int sellid = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<prices[buypid]){
                buypid = i;
                sellid = i;
            }
            if(prices[i]>prices[sellid]){
                sellid = i;
                profit = Math.max(profit,prices[sellid]-prices[buypid]);
            }
        }
        return profit;
    }
}
