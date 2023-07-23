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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int itr : nums){
            hash.add(itr);
        }
        int common = 0;
        int size = 0;
        while(head!=null){
            if(hash.contains(head.val)){
                size++;
            }
            else{
                if(size>0){
                    common++;
                }
                size=0;
            }
            head=head.next;
        }
        if(size>0){
            common+=1;
        }
        return common;
    }
}