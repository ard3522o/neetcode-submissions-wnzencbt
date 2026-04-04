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
if(head == null) return head;
if(head.next == null && n==1) return null;
if(head.next == null && n==0) return head;
int count=0;
ListNode prev = head;
while(prev != null){
    count += 1;
    prev = prev.next;

} 
int k =  count-n;
ListNode dummy = new ListNode(-1);
dummy.next = head;
while(k > 0){
    dummy = dummy.next;
    k--;
}
dummy.next = dummy.next.next;
return head;
    }
}
