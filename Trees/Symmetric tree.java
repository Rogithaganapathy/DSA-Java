/*
LeetCode 101 - Symmetric Tree

Problem:
Determine whether a binary tree is symmetric around its center.

Approach:
- Use recursion.
- Compare the left subtree with the mirror of the right subtree.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
