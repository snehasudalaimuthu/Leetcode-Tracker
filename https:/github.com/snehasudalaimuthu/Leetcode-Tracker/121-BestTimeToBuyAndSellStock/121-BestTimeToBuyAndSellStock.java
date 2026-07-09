// Last updated: 09/07/2026, 11:19:12
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int price : prices)
        {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                maxProfit = Math.max(price - minPrice, maxProfit);
            }
        }

        return maxProfit;
        
    }
}