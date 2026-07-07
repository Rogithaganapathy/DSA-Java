/*
LeetCode 108 - Convert Sorted Array to Binary Search Tree

Problem:
Convert a sorted array into a height-balanced Binary Search Tree (BST).

Approach:
- Use Divide and Conquer.
- Select the middle element as the root.
- Recursively build the left subtree from the left half.
- Recursively build the right subtree from the right half.
- Repeat until all elements are used.

Time Complexity: O(n)
Space Complexity: O(h)

where n is the number of elements and h is the height of the tree.
*/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return build(nums,0,nums.length-1);
    }
    public TreeNode build(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,left,mid-1);
        root.right=build(nums,mid+1,right);
        return root;
    }
}
