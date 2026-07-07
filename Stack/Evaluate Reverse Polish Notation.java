/*
LeetCode 150 - Evaluate Reverse Polish Notation

Problem:
Evaluate the value of an arithmetic expression written in
Reverse Polish Notation (Postfix).

Approach:
- Use a stack to store operands.
- Push numbers onto the stack.
- When an operator is encountered, pop the required operands,
  perform the operation, and push the result back.
- The final value in the stack is the answer.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int b= stack.pop();
                int a =stack.pop();
                stack.push(a+b);
            }
            else  if(token.equals("-")){
                int b= stack.pop();
                int a =stack.pop();
                stack.push(a-b);
            }
            else  if(token.equals("*")){
                int b= stack.pop();
                int a =stack.pop();
                stack.push(a*b);
            }
            else  if(token.equals("/")){
                int b= stack.pop();
                int a =stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.peek();
        
    }
}
