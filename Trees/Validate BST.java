/*
LeetCode 98 - Validate Binary Search Tree

Problem:
Determine whether a binary tree is a valid Binary Search Tree (BST).

Approach:
- Use Depth First Search (DFS).
- Maintain a valid range (minimum and maximum) for each node.
- If a node's value is outside the allowed range, return false.
- Recursively validate the left and right subtrees with updated ranges.

Time Complexity: O(n)
Space Complexity: O(h)

where n is the number of nodes and h is the height of the tree.
*/

class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean dfs(TreeNode node,long min,long max){
        if(node==null){
            return true;
        }
        if(node.val<=min || node.val>=max){
            return false;
        }
        return dfs(node.left,min,node.val)&& dfs(node.right,node.val,max);
    }
}
