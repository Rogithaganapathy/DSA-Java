/*
LeetCode 155 - Min Stack

Problem:
Design a stack that supports push, pop, top, and retrieving
the minimum element in constant time.

Approach:
- Use two stacks.
- One stack stores all elements.
- The other stack stores the minimum value at each step.
- The top of the minimum stack always gives the current minimum.

Time Complexity: O(1)
Space Complexity: O(n)
*/

class MinStack {
     Stack<Integer> stack;
      Stack<Integer> minStack;

    public MinStack() {
         stack=new Stack<>();
         minStack=new Stack<>();
        
    }
    
    public void push(int value) {
        stack.push(value);

        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }

        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
