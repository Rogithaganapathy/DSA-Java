/*
LeetCode 206 - Reverse Linked List

Problem:
Reverse a singly linked list and return the new head.

Approach:
- Traverse the linked list.
- Reverse the direction of each node's next pointer.
- Return the new head after all nodes are reversed.

Time Complexity: O(n)
Space Complexity: O(1)
*/public class Solution {
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

