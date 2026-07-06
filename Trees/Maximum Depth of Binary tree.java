/*
LeetCode 104 - Maximum Depth of Binary Tree

Problem:
Find the maximum depth of a binary tree.

Approach:
- Use recursion.
- Find the depth of left and right subtrees.
- Return 1 + maximum of both depths.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
