class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price: prices){
            if(price<minprice){
                minprice = price;


            }else{
                maxprofit = Math.max(maxprofit, price-minprice);

            }
        }
        return maxprofit;

    }
}

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
