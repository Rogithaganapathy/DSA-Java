/*
LeetCode 700 - Search in a Binary Search Tree

Problem:
Search for a node with the given value in a Binary Search Tree (BST).
Return the node if found, otherwise return null.

Approach:
- Compare the target value with the current node.
- If they are equal, return the current node.
- If the target is smaller, search the left subtree.
- If the target is greater, search the right subtree.

Time Complexity: O(h)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(val<root.val){
            return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right,val);
        }
    }
}
