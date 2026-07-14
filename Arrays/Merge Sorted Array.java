/*
LeetCode 88 - Merge Sorted Array

Problem:
Merge two sorted arrays into one sorted array in-place.

Approach:
- Use three pointers starting from the end of the arrays.
- Compare the largest remaining elements.
- Place the larger element at the end of the merged array.
- Continue until all elements are merged.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k]= nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        
    }
}
