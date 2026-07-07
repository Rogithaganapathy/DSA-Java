/*
LeetCode 1011 - Capacity To Ship Packages Within D Days

Problem:
Find the minimum ship capacity required to deliver all packages
within the given number of days.

Approach:
- Apply Binary Search on the possible ship capacities.
- For each capacity, calculate the number of days required.
- If all packages can be shipped within D days, try a smaller capacity.
- Otherwise, increase the capacity.

Time Complexity: O(n log m)
Space Complexity: O(1)

where n is the number of packages and m is the sum of all package weights.
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        
        for(int w:weights){
            left=Math.max(left,w);
            right+=w;
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean canShip(int[] weights,int days,int cap ){
        int currentWeight=0;
        int usedDays=1;

        for(int w:weights){
            if(currentWeight+w > cap){
                usedDays++;
                currentWeight=w;
            }
            else{
                currentWeight+=w;
            }
        }
        return usedDays<=days;
    }
}
