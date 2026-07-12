/*
LeetCode 83 - Remove Duplicates from Sorted List

Problem:
Remove duplicate nodes from a sorted linked list.

Approach:
- Traverse the linked list.
- If the current node and the next node have the same value,
  skip the duplicate node.
- Continue until the end of the list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }

        }
        return head;
        
    }
}
