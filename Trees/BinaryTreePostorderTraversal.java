/*
LeetCode 145 - Binary Tree Postorder Traversal

Problem:
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Approach:
- Use recursion to traverse the binary tree.
- Visit the left subtree first.
- Then visit the right subtree.
- Finally, visit the current node.

Traversal Order:
Left → Right → Root

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        postorder(root,result);
        return result;
    }
    private void postorder(TreeNode node,List<Integer> result){
        if(node==null){
            return ;
        }
        postorder(node.left,result);
        postorder(node.right,result);
        result.add(node.val);
    }
}
