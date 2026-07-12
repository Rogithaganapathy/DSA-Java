/*
LeetCode 141 - Linked List Cycle

Problem:
Determine whether a linked list contains a cycle.

Approach:
- Use Floyd's Cycle Detection algorithm.
- Move slow by one node and fast by two nodes.
- If the pointers meet, a cycle exists.
- Otherwise, the list has no cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;   
    }
}

