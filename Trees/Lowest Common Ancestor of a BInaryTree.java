/*
LeetCode 236 - Lowest Common Ancestor of a Binary Tree

Problem:
Find the lowest common ancestor (LCA) of two given nodes in a
binary tree.

Approach:
- Use Depth First Search (DFS).
- If the current node is null or matches either target node,
  return the current node.
- Recursively search the left and right subtrees.
- If both sides return a node, the current node is the LCA.
- Otherwise, return the non-null result.

Time Complexity: O(n)
Space Complexity: O(h)

where n is the number of nodes and h is the height of the tree.
*/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ||root==p||root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null && right==null){
            return null;
        }
        if(left!=null){
            return left;
        }
        return right;
        
    }
}
