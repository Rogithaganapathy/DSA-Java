/*
LeetCode 876 - Middle of the Linked List

Problem:
Find the middle node of a singly linked list.

Approach:
- Use two pointers: slow and fast.
- Move slow by one node and fast by two nodes.
- When fast reaches the end, slow points to the middle node.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
