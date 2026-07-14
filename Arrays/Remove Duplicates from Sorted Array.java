/*
LeetCode 26 - Remove Duplicates from Sorted Array

Problem:
Remove duplicates from a sorted array in-place and return the
number of unique elements.

Approach:
- Use two pointers.
- One pointer tracks the position of the next unique element.
- Traverse the array and copy each new unique element to the
  correct position.
- Return the count of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=1;right< nums.length;right++){
            if(nums[left]!= nums[right]){
                left++;
                nums[left]= nums[right];
            }
        }
        return left+1;
        
    }
}
