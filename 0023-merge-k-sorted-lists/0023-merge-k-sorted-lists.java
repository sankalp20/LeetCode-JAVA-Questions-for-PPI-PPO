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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(true){
            int p = 0;
            for(int i = 0; i < lists.length; i++){
                if(lists[p] == null || (lists[i] != null && lists[p].val > lists[i].val)){
                    p = i;
                }
            }
            if(lists[p] == null) {
                break;
        }
        temp.next = lists[p];
            temp =temp.next;
        lists[p] = lists[p].next;
    }
    return head.next;
}
}
