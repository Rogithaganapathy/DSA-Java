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
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
        
        
    }
}
