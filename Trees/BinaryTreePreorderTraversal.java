/*
LeetCode 144 - Binary Tree Preorder Traversal

Problem:
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Approach:
- Use recursion to traverse the binary tree.
- Visit the current node first.
- Then visit the left subtree.
- Finally, visit the right subtree.

Traversal Order:
Root → Left → Right

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {
    List <Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }
    private void preorder(TreeNode node){
        if(node == null){
            return ;
        }
        result.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
