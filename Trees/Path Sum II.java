/*
LeetCode 113 - Path Sum II

Problem:
Return all root-to-leaf paths where the sum of node values equals the target sum.

Approach:
- Use DFS with backtracking.
- Maintain the current path.
- Add the path to the answer when the target sum is reached at a leaf node.

Time Complexity: O(n²) in the worst case
Space Complexity: O(h)
*/

class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,new ArrayList<>());
        return ans;
    }
    public void dfs(TreeNode root,int targetSum ,List<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.val);
        targetSum-=root.val;

        if(root.left==null && root.right==null && targetSum==0){
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left,targetSum,path);
        dfs(root.right,targetSum,path);
        path.remove(path.size()-1);
    }
}
