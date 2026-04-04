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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        
        ListNode r1 = l1;
        ListNode r2 = l2;
        ListNode node = new ListNode(0);
        int  carry = 0;
ListNode curr = node;
        while(r1 != null || r2 != null || carry != 0){
            int sum = carry;
          if(r1 != null){
sum += r1.val;
r1 = r1.next;
          }  
          if(r2 != null){
            sum += r2.val;
            r2 = r2.next;
          }
carry = sum/10;
curr.next = new ListNode(sum%10);
curr = curr.next;
        }
        // ListNode n1 = reverse(node.next);
        // return n1;
        return node.next;

    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}
