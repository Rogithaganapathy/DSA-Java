/*
LeetCode 112 - Path Sum

Problem:
Determine if there exists a root-to-leaf path whose sum equals the target sum.

Approach:
- Use DFS recursion.
- Subtract the current node value from the target.
- Check if the remaining sum becomes zero at a leaf node.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
