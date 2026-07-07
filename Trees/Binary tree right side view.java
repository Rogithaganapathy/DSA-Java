/*
LeetCode 199 - Binary Tree Right Side View

Problem:
Return the values of the nodes visible when looking at the binary
tree from the right side.

Approach:
- Use Breadth First Search (BFS) with a queue.
- Traverse the tree level by level.
- At each level, record the last node processed, as it is the
  rightmost node visible from that level.
- Add its value to the result.

Time Complexity: O(n)
Space Complexity: O(n)

where n is the number of nodes.
*/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                
                if(i==size-1){
                    ans.add(node.val);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return ans;
    }
}
