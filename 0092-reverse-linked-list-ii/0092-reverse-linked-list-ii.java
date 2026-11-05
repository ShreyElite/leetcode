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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode h1=dummy; // original list
        ListNode h2=new ListNode(-1); // disconnect location
        ListNode t1=new ListNode(-1); // dis end
        ListNode t2=new ListNode(-1);  // original last dis
        int length=1;
        
        if(head==null || head.next==null) return head;
       
         for(int i=1;i<=left-1;i++){
           h1=h1.next;  
         }
        
        while(temp!=null){
            
           if(length==left){
             
             h2=temp;
           }
           if(length==right){
            t1=temp;
            t2=temp.next;
           }
           length++;
           temp=temp.next;
        }
          h1.next=null;
          t1.next=null;
         ListNode b=reverse(h2);
         
       h1.next=b;
       h2.next=t2;
       return dummy.next;
       

    }
}