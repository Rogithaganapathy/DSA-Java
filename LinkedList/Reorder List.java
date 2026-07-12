/*
LeetCode 143 - Reorder List

Problem:
Reorder the linked list as:
L0 → Ln → L1 → Ln-1 → ...

Approach:
- Find the middle of the linked list.
- Reverse the second half.
- Merge the first and second halves alternately.
- Return the reordered list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second.next!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
        
    }
}
