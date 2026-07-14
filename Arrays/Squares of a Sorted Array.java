/*
LeetCode 977 - Squares of a Sorted Array

Problem:
Return a sorted array containing the squares of each element.

Approach:
- Use two pointers at both ends of the array.
- Compare the absolute values of both ends.
- Place the larger square at the end of the result array.
- Continue until all elements are processed.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] answer =  new int[n];
        int left=0;
        int right=n-1;
        int k=n-1;
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                answer[k] = nums[left]* nums[left];
                left++;
            }
            else{
                answer[k] = nums[right]* nums[right];
                right--;
            }
            k--;
        }
        return answer;
        
    }
}
