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
   
   
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
         ListNode curr=head;
         ListNode f=head.next;
         ListNode c=head;
         ListNode dummy=new ListNode(-1);
         ListNode d=dummy;
         while(f!=null && c!=null) {
             d.next=f;
             c.next=f.next;
             f.next=c;
             d=c;
             c=c.next;
         if(c!=null)    f=c.next;

         }
         return dummy.next;
     }
}