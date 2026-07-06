/*
LeetCode 94 - Binary Tree Inorder Traversal

Problem:
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Approach:
- Use recursion to traverse the binary tree.
- Visit the left subtree first.
- Visit the current node.
- Visit the right subtree.

Traversal Order:
Left → Root → Right

Time Complexity: O(n)
Space Complexity: O(h)
where:
n = number of nodes
h = height of the tree
*/

class Solution {
    List<Integer> result= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return result;
        
    }
    private void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        result.add(node.val);
        inorder(node.right);
    }
}
