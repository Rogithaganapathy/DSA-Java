/*
LeetCode 19 - Remove Nth Node From End of List

Problem:
Remove the nth node from the end of a linked list.

Approach:
- Use two pointers with a fixed gap of n nodes.
- Move both pointers until the fast pointer reaches the end.
- Remove the target node by updating the links.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
}
