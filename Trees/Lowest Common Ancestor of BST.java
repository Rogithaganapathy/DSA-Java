/*
LeetCode 235 - Lowest Common Ancestor of a Binary Search Tree

Problem:
Find the lowest common ancestor (LCA) of two given nodes in a
Binary Search Tree (BST).

Approach:
- Compare both node values with the current node.
- If both values are smaller, move to the left subtree.
- If both values are greater, move to the right subtree.
- Otherwise, the current node is the lowest common ancestor.

Time Complexity: O(h)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
