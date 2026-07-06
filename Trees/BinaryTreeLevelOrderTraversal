/*
LeetCode 102 - Binary Tree Level Order Traversal

Problem:
Given the root of a binary tree, return the level order traversal of its nodes' values.
(i.e., from left to right, level by level).

Approach:
- Use Breadth-First Search (BFS) with a Queue.
- Start by adding the root node to the queue.
- Process all nodes at the current level.
- Add their left and right children to the queue.
- Repeat until the queue becomes empty.

Traversal Order:
Level by Level (Top → Bottom, Left → Right)

Time Complexity: O(n)
Space Complexity: O(n)

where:
n = number of nodes in the binary tree
*/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level =new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                level.add(node.val);

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
