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
     public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
         ListNode a=head.next;
         head.next=null;
         ListNode b=reverse(a);
         a.next=head;
         return b;
    }
    public int pairSum(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         ListNode second=slow.next;
          slow.next=null;
          slow=head;
          ListNode comp=reverse(second);
          int maxsum=slow.val+comp.val;
          while(slow.next!=null && comp.next!=null){
              if(maxsum<=slow.next.val+comp.next.val){
                maxsum=slow.next.val+comp.next.val;
              }
              slow=slow.next;
              comp=comp.next;
          }
          return maxsum;
    }
}