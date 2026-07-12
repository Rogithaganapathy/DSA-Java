/*
LeetCode 21 - Merge Two Sorted Lists

Problem:
Merge two sorted linked lists into one sorted linked list.

Approach:
- Compare the current nodes of both lists.
- Append the smaller node to the merged list.
- Continue until one list is exhausted.
- Attach the remaining nodes.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null){
            if(p1.val<=p2.val){
                current.next=p1;
                current=current.next;
                p1=p1.next;
            }
            else{
                current.next=p2;
                current=current.next;
                p2=p2.next;
            }
        }
        if(p1!=null){
            current.next=p1;
        }
        if(p2!=null){
            current.next=p2;
        }
        return dummy.next;

        
    }
}
