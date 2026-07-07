/*
LeetCode 22 - Generate Parentheses

Problem:
Generate all combinations of well-formed parentheses
for the given number of pairs.

Approach:
- Use Backtracking.
- Add an opening parenthesis if available.
- Add a closing parenthesis only when it keeps the string valid.
- Add the completed combination to the result.

Time Complexity: O(4ⁿ / √n)
Space Complexity: O(n)
*/

class Solution {
    List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack("",0,0,n);
        return result;
        
    }
    public void backtrack(String current,int open,int close,int n){
        if(open==n && close==n){
            result.add(current);
            return;
        }
        if(open<n){
            backtrack(current+'(',open+1,close,n);
        }
        if(close<open){
            backtrack(current+')',open,close+1,n);
        }
    }
}
