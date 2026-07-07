/*
LeetCode 701 - Insert into a Binary Search Tree

Problem:
Insert a new value into a Binary Search Tree (BST).
Return the root of the updated BST.

Approach:
- Traverse the BST to find the correct position.
- If the value is smaller, move to the left subtree.
- If the value is greater, move to the right subtree.
- Insert the new node when a null position is reached.

Time Complexity: O(h)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insertIntoBST(root.left,val);
        }
        else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}
