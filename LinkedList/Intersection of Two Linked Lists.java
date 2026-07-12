/*
LeetCode 160 - Intersection of Two Linked Lists

Problem:
Find the node where two linked lists intersect.

Approach:
- Use two pointers starting from each list.
- When a pointer reaches the end, redirect it to the other list.
- If the lists intersect, the pointers will meet at the
  intersection node.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            if(p1==null){
                p1=headB;
            }
            else{
                p1=p1.next;
            }
            if(p2==null){
                p2=headA;
            }
            else{
                p2=p2.next;
            }

        }
        return p1;
        
    }
}
