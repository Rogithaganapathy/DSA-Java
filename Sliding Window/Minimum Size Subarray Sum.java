/*
LeetCode 209 - Minimum Size Subarray Sum

Problem:
Find the minimum length of a contiguous subarray whose sum is
greater than or equal to the target.

Approach:
- Use a sliding window with two pointers.
- Expand the window by adding elements.
- While the window sum is greater than or equal to the target,
  update the minimum length and shrink the window.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                ans= Math.min(ans,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE ? 0:ans;
    }
}
