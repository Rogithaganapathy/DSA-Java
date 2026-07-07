/*
LeetCode 230 - Kth Smallest Element in a BST

Problem:
Find the kth smallest element in a Binary Search Tree (BST).

Approach:
- Perform an inorder traversal (Left → Root → Right).
- Since inorder traversal of a BST visits nodes in sorted order,
  count each visited node.
- Return the value when the kth node is reached.

Time Complexity: O(n)
Space Complexity: O(h)

where n is the number of nodes and h is the height of the tree.
*/

class Solution {
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    void inorder(TreeNode root,int k){
        if(root==null || count>=k){
            return;
        }
        inorder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
        }
        inorder(root.right,k);
    }
}
