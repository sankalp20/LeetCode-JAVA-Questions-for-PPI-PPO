/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        //edge case
        if(head == null || head.next == null || k == 0) return head;
        
        //Compute the length
        ListNode cur = head;
        int len = 1;
        while(cur.next != null){
            len++;
            cur = cur.next;
        }
        
        // Go till that node
        cur.next = head;
        k = k%len; // to check if K is more than l
        k = len - k;
        while(k-- > 0){
            cur = cur.next;
        }
        
        // Make the node head and break the connection
        head = cur.next;
        cur.next = null;
        
        return head;
    }
}