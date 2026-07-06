/*
LeetCode 543 - Diameter of Binary Tree

Problem:
Find the length of the longest path between any two nodes.

Approach:
- Use DFS.
- Calculate left and right subtree heights.
- Update the maximum diameter at each node.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
        
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        diameter=Math.max(diameter,left+right);
        
        return 1+Math.max(left,right);
    }
}
