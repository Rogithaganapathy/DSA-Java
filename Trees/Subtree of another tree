/*
LeetCode 572 - Subtree of Another Tree

Problem:
Given the roots of two binary trees, determine whether one tree
is a subtree of the other.

Approach:
- Traverse every node in the main tree.
- At each node, check if the subtree rooted at that node is
  identical to the given subtree.
- Use a helper function to compare two trees recursively.

Time Complexity: O(m × n) in the worst case
Space Complexity: O(h)

where:
m = number of nodes in the main tree
n = number of nodes in the subtree
h = height of the main tree (recursive call stack)
*/

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isSameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
