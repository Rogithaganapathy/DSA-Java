/*
LeetCode 1672 - Richest Customer Wealth

Problem:
Find the maximum wealth among all customers, where each customer's
wealth is the sum of their bank account balances.

Approach:
- Traverse each customer's accounts.
- Calculate the total wealth by summing all account balances.
- Keep track of the maximum wealth encountered.
- Return the maximum wealth.

Time Complexity: O(m × n)
Space Complexity: O(1)

where m is the number of customers and n is the number of accounts per customer.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int currentWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                currentWealth+=accounts[i][j];
            }
            if(currentWealth>maxWealth){
                maxWealth=currentWealth;
            }
        }
        return maxWealth;
        
    }
}
