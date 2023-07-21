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

// TLE on this approach

// class Solution {
//     public void reorderList(ListNode head) {
//         if(head == null || head.next == null) return;
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode prev = head;
        
//         while(fast != null && fast.next != null){
//             prev = slow;
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         prev.next = null;
//         ListNode l1 = head;
//         ListNode l2 = reverse(slow);
//         merge(l1, l2);
//     }
    
//     private static ListNode reverse(ListNode l2){
//         if(l2 == null) return null;
//         ListNode prev = null;
//         ListNode curr = l2;
//         ListNode next = l2.next;
        
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
    
//     private static void merge(ListNode l1, ListNode l2){
//         while(l2 != null) {
//             ListNode next = l1.next;
//             l1.next = l2;
//             l2 = next;
//         }
//     }
// }

// Approach 2: Find middle of linkedlist. Divide linkedlist into two parts reverse the second half. Keep pointers on head of both the linkedlist, keep traversing and redordering as required by question

class Solution {
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode rev(ListNode head){
        ListNode curr = head; 
        ListNode prev = null;
        ListNode forward = null;
        while(curr!= null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode mid = mid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode p2 = rev(midNext);
        ListNode p1 = head;

        ListNode temp;

        while(p1!=null && p2!=null){
            temp = p1.next;
            p1.next = p2;
            
            p1 = p2;
            p2 = temp;
        }
    }
    
}