/*
LeetCode 215 - Kth Largest Element in an Array

Problem:
Find the kth largest element in an unsorted array.

Approach:
- Use a Min Heap (Priority Queue) of size k.
- Insert each element into the heap.
- If the heap size exceeds k, remove the smallest element.
- After processing all elements, the top of the heap is the
  kth largest element.

Time Complexity: O(n log k)
Space Complexity: O(k)
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
            if(pq.size() > k ){
               pq.poll();
            }
        }
        
        return pq.peek();
    }
}
