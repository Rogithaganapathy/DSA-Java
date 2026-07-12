/*
LeetCode 239 - Sliding Window Maximum

Problem:
Find the maximum element in every sliding window of size k.

Approach:
- Use a deque to store indices of useful elements.
- Remove indices outside the current window.
- Maintain the deque in decreasing order of values.
- The front of the deque always stores the maximum element.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int left=0;

        for(int right=0;right<n;right++){
            if(!dq.isEmpty() && dq.peekFirst() < left){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[right]){
                dq.removeLast();
            }
            dq.addLast(right);
            
            if(right>=k-1){
                result[left]=nums[dq.peekFirst()];
                left++;
            }
        

        }
        return result;
    }
}
