class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_price=prices[0];
        int n=prices.length;
        for(int sell=0;sell<n;sell++)
        {
            if(prices[sell] < min_price)
            {
                min_price=prices[sell];
            }
            if((prices[sell]-min_price) >max_profit)
            {
                max_profit=prices[sell]-min_price;
            }
        }
        return  max_profit;
    }
}