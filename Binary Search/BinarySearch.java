/*
LeetCode 704 - Binary Search

Problem:
Search for a target value in a sorted array.
Return its index if found, otherwise return -1.

Approach:
- Use Binary Search on the sorted array.
- Compare the middle element with the target.
- If equal, return the index.
- If the target is smaller, search the left half.
- If the target is greater, search the right half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
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
        return -1;
        
        
    }
}
