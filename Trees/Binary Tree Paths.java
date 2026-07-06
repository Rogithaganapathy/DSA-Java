/*
LeetCode 257 - Binary Tree Paths

Problem:
Return all root-to-leaf paths in a binary tree.

Approach:
- Use Depth First Search (DFS).
- Build the current path while traversing.
- Add the path when a leaf node is reached.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return ans;
    }
    void dfs(TreeNode root,String path){
        if(root==null){
            return;
        }
        String newPath;
        if(path.equals("")){
            newPath=""+root.val;
        }
        else{
            newPath=path+ "->"+root.val;
        }
        if(root.left==null && root.right==null){
            ans.add(newPath);
        }
        dfs(root.left,newPath);
        dfs(root.right,newPath);

        ans.remove(ans.size()-1);

    }
}
