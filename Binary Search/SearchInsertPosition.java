/*
LeetCode 35 - Search Insert Position

Problem:
Find the index of the target in a sorted array.
If the target is not present, return the index where it should be inserted.

Approach:
- Use Binary Search.
- Compare the middle element with the target.
- Continue searching until the correct position is found.
- Return the insertion index if the target does not exist.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
        
    }
}
