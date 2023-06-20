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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        //find middle of the linked list
        while(fast.next != null && fast.next.next != null  ){
            
         //reaches last or second last node
            slow = slow.next;
            fast = fast.next.next;
           }
    
    
    //reverse the right half of the linkedList
    slow.next = reverseList(slow.next);
    
    //move slow to right half
    slow = slow.next;
    
    //check for left half right half equal or not
    while(slow!=null){
        if(head.val != slow.val)
            return false;
        
        head = head.next;
        slow = slow.next;
    }
    return true;
}

//reverseList
    ListNode reverseList (ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    
}
}