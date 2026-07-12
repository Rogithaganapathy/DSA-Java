/*
LeetCode 234 - Palindrome Linked List

Problem:
Determine whether a linked list is a palindrome.

Approach:
- Find the middle of the linked list.
- Reverse the second half.
- Compare the first half and the reversed second half.
- If all values match, the list is a palindrome.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
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
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
        
    }
}
