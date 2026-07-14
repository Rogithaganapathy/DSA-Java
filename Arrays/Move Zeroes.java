/*
LeetCode 283 - Move Zeroes

Problem:
Move all zeroes to the end of the array while maintaining the
relative order of the non-zero elements.

Approach:
- Use two pointers.
- One pointer tracks the position for the next non-zero element.
- Traverse the array and swap each non-zero element into its
  correct position.
- All zeroes are automatically moved to the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]= temp;
                 
                left++;
            }
        }
        
    }
}
