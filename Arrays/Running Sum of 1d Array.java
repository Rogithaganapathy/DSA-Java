/*
LeetCode 1480 - Running Sum of 1d Array

Problem:
Return the running sum of the given array, where each element
is the sum of all previous elements including itself.

Approach:
- Traverse the array from left to right.
- Update each element by adding the previous running sum.
- Return the modified array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
        
    }
}
