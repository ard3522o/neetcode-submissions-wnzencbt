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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n==1))return null;
int size = 1;
ListNode node = head;
while(node.next != null){
    node = node.next;
    size++; 
}
int ex = size -n;
ListNode dummy = new ListNode(0);
ListNode nb = dummy;
dummy.next = head;
node = head;
while(ex-- > 0){
    node = node.next;
    nb = nb.next;
}
nb.next = nb.next.next;
node.next = null;
return dummy.next;
    }
}
