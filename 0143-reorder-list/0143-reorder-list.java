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
    public void reorderList(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
      ListNode slow=head;
      ListNode fast=head;
      if(length%2==0){
      while(fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
      }
      }
      else{
           while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
      }
      }
          ListNode second=slow.next;
          slow.next=null;
          ListNode rev=reverse(second);
          
          ListNode t1=head;
          ListNode t2=rev; 
         
           
            
          while(t1!=null && t2!=null){
            ListNode tem=t1.next;
           ListNode temp2=t2.next;
           t1.next=t2;
           t2.next=tem;
           t1=tem;
              t2=temp2;
          }
         
    }
}