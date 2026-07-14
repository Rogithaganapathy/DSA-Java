/*
LeetCode 121 - Best Time to Buy and Sell Stock

Problem:
Find the maximum profit that can be achieved by buying and
selling a stock once.

Approach:
- Traverse the array while tracking the minimum stock price seen.
- Calculate the profit for each day.
- Update the maximum profit whenever a larger profit is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit= 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice=prices[i];
            }
            int profit =  prices[i]-minPrice;
            if(profit > maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
