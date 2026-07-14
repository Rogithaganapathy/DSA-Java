/*
LeetCode 53 - Maximum Subarray

Problem:
Find the contiguous subarray with the largest sum.

Approach:
- Use Kadane's Algorithm.
- Traverse the array while maintaining the maximum sum ending
  at the current position.
- Update the overall maximum sum whenever a larger sum is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentSum+=nums[i];
            if(currentSum > maxSum){
                maxSum= currentSum;
            }
            if(currentSum < 0){
                currentSum=0;
            }
        }
        return maxSum;
        
    }
}
