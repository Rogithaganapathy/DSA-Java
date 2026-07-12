/*
LeetCode 142 - Linked List Cycle II

Problem:
Find the node where the cycle begins in a linked list.

Approach:
- Use Floyd's Cycle Detection algorithm.
- Detect the meeting point of slow and fast pointers.
- Move one pointer to the head.
- Move both pointers one step at a time until they meet again.
- The meeting node is the start of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){

                ListNode ptr=head;

                while(ptr!=slow){

                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
      
    }
}
