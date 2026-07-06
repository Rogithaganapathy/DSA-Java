/*
LeetCode 111 - Minimum Depth of Binary Tree

Problem:
Find the minimum depth of a binary tree.
The minimum depth is the number of nodes along the shortest path
from the root node down to the nearest leaf node.

Approach:
- Use recursion.
- Handle cases where one child is null separately.
- If a node has only one child, return the depth of the non-null child.
- Otherwise, return 1 + minimum depth of left and right subtrees.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);

        if(root.left==null){
            return 1+right;
        }
        if(root.right==null){
            return 1+left;
        }
        return 1+Math.min(left,right);
    }
}
