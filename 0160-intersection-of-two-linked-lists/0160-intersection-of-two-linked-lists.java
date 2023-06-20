/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        // If a & b have different length, then we have to stop the loop after 2nd iteration.
        while(a!=b){
            a=a==null ? headB : a.next;
            b=b==null ? headA : b.next;
        }
        return a;
    }
}