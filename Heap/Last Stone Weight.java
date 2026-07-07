/*
LeetCode 1046 - Last Stone Weight

Problem:
Find the weight of the last remaining stone after repeatedly
smashing the two heaviest stones together.

Approach:
- Use a Max Heap (Priority Queue) to always access the two
  heaviest stones.
- Remove the two largest stones.
- If their weights are different, insert the difference back
  into the heap.
- Repeat until at most one stone remains.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>=2){
            int first=pq.poll();
            int second=pq.poll();
            if(first!=second){
                pq.offer(first-second);
            }

        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
    }
}
