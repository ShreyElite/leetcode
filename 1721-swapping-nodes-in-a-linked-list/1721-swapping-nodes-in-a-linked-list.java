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
    public ListNode swapNodes(ListNode head, int k) {
         int i=1;
         
         ListNode  temp=head;
         int length=0;
         while(temp!=null){
            temp=temp.next;
            length++;
         }
        
         int j=length;
         
         temp=head;
        ListNode first=head;
        ListNode sec=head;
         while(i<=length){
            if(i==k){
             first=temp;
            }
            if(j==k){
              sec=temp;
            }
            temp=temp.next;
           i++;
           j--;
         }
          int tem=first.val;
               first.val=sec.val;
               sec.val=tem;
          return head;
    }
}