/*
LeetCode 34 - Find First and Last Position of Element in Sorted Array

Problem:
Find the first and last occurrence of a target value in a sorted array.
Return [-1, -1] if the target is not found.

Approach:
- Use Binary Search twice.
- First search finds the leftmost occurrence.
- Second search finds the rightmost occurrence.
- Return both indices.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        return new int[]{
            firstOccurence(nums,target),
            secondOccurence(nums,target)
        };
    }
        public int firstOccurence(int[] nums,int target){
            int left=0;
            int right=nums.length-1;
            int ans=-1;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(target==nums[mid]){
                   ans=mid;
                   right=mid-1;
                }
                else if(target>nums[mid]){
                    left=mid+1;
                }
                else{
                   right=mid-1;
                }
            }
            return ans;
        }

        public int secondOccurence(int[] nums,int target){
            int left=0;
            int right=nums.length-1;
            int ans=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(target==nums[mid]){
                   ans=mid;
                   left=mid+1;
                }
                else if(target>nums[mid]){
                    left=mid+1;
                }
                else{
                   right=mid-1;
                }
            }
            return ans;
        }

}
