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
    public ListNode deleteDuplicates(ListNode head) {
        int i=0;
        int j=0;
         ListNode temp=head;
         ListNode sec=head;
        while(temp!=null ) {
            if(sec.val==temp.val){
                temp=temp.next;
            }
            else{
                 sec.next=temp;
                 sec=temp;
                 temp=temp.next;
            }
        } 
        if(head==null) return null;
        sec.next=null;
         
        return head;
    }
}