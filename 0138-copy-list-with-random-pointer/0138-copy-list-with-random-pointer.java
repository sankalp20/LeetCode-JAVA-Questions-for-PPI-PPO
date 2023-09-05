/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    if (head == null) return null;

    var len = 0;
    for (var ptr = head; ptr != null; ptr = ptr.next) len++;

    var newList = new Node[len];
    var ptr = head;

    for (var i=0; i<len; i++, ptr = ptr.next) {
      newList[i] = new Node(ptr.val);
      ptr.val = i;
    }
    ptr = head;

    for (var i=0; i<len; i++, ptr = ptr.next) {
      if (i < len-1)
        newList[i].next = newList[i+1];
        
      newList[i].random = ptr.random == null ? null : newList[ptr.random.val];
    }
    return newList[0];
  }
}