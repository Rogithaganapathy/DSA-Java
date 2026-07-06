/*
LeetCode 110 - Balanced Binary Tree

Problem:
Determine whether a binary tree is height-balanced.

Approach:
- Use postorder traversal.
- Calculate the height of left and right subtrees.
- Check if their height difference is at most one.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=height(root.left);
        int right=height(root.right);

        return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
