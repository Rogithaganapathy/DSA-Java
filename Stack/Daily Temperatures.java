/*
LeetCode 739 - Daily Temperatures

Problem:
For each day, find how many days must pass until a warmer
temperature occurs.

Approach:
- Use a monotonic decreasing stack to store indices.
- Traverse the temperatures array.
- While the current temperature is greater than the temperature
  at the top index of the stack, update the answer.
- Push the current index onto the stack.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int idx=stack.pop();
                ans[idx]=i-idx;
            }
            stack.push(i);
        }
        return ans;
    }
}
