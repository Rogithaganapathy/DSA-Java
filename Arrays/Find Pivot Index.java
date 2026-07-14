/*
LeetCode 724 - Find Pivot Index

Problem:
Find the pivot index where the sum of all elements to the left
is equal to the sum of all elements to the right.

Approach:
- Calculate the total sum of the array.
- Traverse the array while maintaining the left sum.
- The right sum is the total sum minus the left sum and the current element.
- If the left and right sums are equal, return the current index.
- If no pivot index exists, return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int arr:nums){
            totalSum+=arr;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum= totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1; 
    }
}
