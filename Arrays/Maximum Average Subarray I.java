/*
LeetCode 643 - Maximum Average Subarray I

Problem:
Find the maximum average value of a subarray of length k.

Approach:
- Use a fixed-size sliding window.
- Calculate the sum of the first k elements.
- Slide the window by removing the leftmost element and adding
  the next element.
- Keep track of the maximum window sum.
- Return the maximum average.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }
        int currentSum=maxSum;
        for(int i=k;i<nums.length;i++){
            currentSum= currentSum-nums[i-k]+nums[i];

            if(currentSum>maxSum){
            maxSum=currentSum;
        }
        }
        
        return (double)maxSum/k;

        
    }
}
