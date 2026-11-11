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
    public ListNode removeElements(ListNode head, int val) {
        
      

      //  ListNode dummy=t; ListNode t=new ListNode(-1);
       

        if(head==null) return null;
        ListNode temp=head;
        ListNode p=new ListNode(-1);
        ListNode pre=p;
    
        while( temp!=null  ){
           if(temp.next==null && temp.val==val ){
            pre.next=null;
           }
        if(temp.val==val) {
          temp=temp.next;
         
                 }
        else{
            pre.next=temp;
            temp=temp.next;
          pre=pre.next;

        }
        

        }
        
        return p.next;

        

    }
}