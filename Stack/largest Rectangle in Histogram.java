/*
LeetCode 84 - Largest Rectangle in Histogram

Problem:
Find the area of the largest rectangle that can be formed
in a histogram.

Approach:
- Use a monotonic increasing stack.
- Store indices of bars with increasing heights.
- When a smaller height is encountered, calculate the maximum
  rectangle area using the popped bars.
- Process any remaining bars after traversal.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;

        for(int i=0;i<=heights.length;i++){

            int current = (i==heights.length)?0:heights[i]; 

            while(!stack.isEmpty() && current < heights[stack.peek()]){
                
                int height=heights[stack.pop()];
                int left=stack.isEmpty()?-1:stack.peek();
                int width= i-left-1;
                max =Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
        
    }
}
