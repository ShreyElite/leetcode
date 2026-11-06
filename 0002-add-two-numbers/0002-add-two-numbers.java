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
        
        ListNode dummy=new ListNode(-1);
       ListNode d1=dummy;
      ListNode tem=l1;
     

      ListNode list1=l1;
       ListNode list2=l2;
       
        int sum=0;
        int carr=0;

        while(list1!=null && list2!=null){
            sum=carr+list1.val+list2.val;
            
            if(sum>=10){
                carr=1;
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
            }
            else{
                ListNode temp=new ListNode(sum);
                carr=0;
                dummy.next=temp;
            }
            dummy=dummy.next;
            list1=list1.next;
            list2=list2.next;

        }
        while(list1!=null){
            sum=list1.val+carr;
            if(sum>=10){
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
              carr=1;
            }
            else{
                ListNode temp=new ListNode(sum);
                carr=0;
                dummy.next=temp;
            }
            dummy=dummy.next;
            list1=list1.next;

        }
        while(list2!=null){
            sum=list2.val+carr;
            if(sum>=10){
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
              carr=1;
            }
            else{
                ListNode temp=new ListNode(sum);
                carr=0;
                dummy.next=temp;
            }
            dummy=dummy.next;
            list2=list2.next;

        }
         if(carr==1) {
            ListNode temp=new ListNode(1);
            dummy.next=temp;
         }
         
        return d1.next;
    }
}