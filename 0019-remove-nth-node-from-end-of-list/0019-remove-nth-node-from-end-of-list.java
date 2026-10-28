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
         ListNode f=head;
        ListNode  sec=head;
         for(int i=0;i<n;i++){
            sec=sec.next;
         }
          if(sec==null){
            return head.next;
          }
         while(  sec.next!=null){
                f=f.next;
                sec=sec.next;
         }
         f.next=f.next.next;
         return head;

    }
}