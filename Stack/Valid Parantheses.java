/*
LeetCode 20 - Valid Parentheses

Problem:
Determine whether the given string of brackets is valid.

Approach:
- Use a stack to keep track of opening brackets.
- Push opening brackets onto the stack.
- For each closing bracket, check if it matches the top of the stack.
- If all brackets match and the stack is empty, the string is valid.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if(ch==')' && top!='(' || 
                   ch=='}' && top!='{' ||
                   ch==']' && top!='[' ){
                    return false;
                   }
               
                stack.pop();
            }
        }
        return stack.isEmpty();
        
    }
}
