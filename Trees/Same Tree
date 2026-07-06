/*
LeetCode 100 - Same Tree

Problem:
Determine whether two binary trees are identical.

Approach:
- Use recursion.
- Compare current node values.
- Recursively compare left and right subtrees.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null|| q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
