/*
LeetCode 637 - Average of Levels in Binary Tree

Problem:
Return the average value of the nodes on each level of a binary tree.

Approach:
- Use Breadth First Search (BFS) with a queue.
- Traverse the tree level by level.
- Calculate the sum of all node values at each level.
- Divide the sum by the number of nodes in that level and add the
  average to the result.

Time Complexity: O(n)
Space Complexity: O(n)

where n is the number of nodes.
*/

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> ans=new ArrayList<>();

        if(root==null){
            return ans;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
