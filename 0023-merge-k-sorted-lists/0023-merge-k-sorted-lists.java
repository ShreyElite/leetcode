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
    public ListNode merge(ListNode a,ListNode b ){
        if(a==null) return b;
        if(b==null) return a;
        ListNode t=a;
        ListNode t2=b;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        
        while(t!=null && t2!=null){
            if(t.val<t2.val){
                k.next=t;
                t=t.next;
            }
            else{
                k.next=t2;
                t2=t2.next;
            }
            k=k.next;
        }
        if(t==null) k.next=t2;
      if(t2==null)   k.next=t;
      return dummy.next;
    }
    public ListNode dnq(int low,int high,ArrayList<ListNode> list){
        if(low>high){
            return null;
        }
        if(low==high){
           return list.get(low) ;
        }
        int mid=low+(high-low)/2;
        ListNode l1=dnq(low,mid,list);
        ListNode l2=dnq(mid+1,high,list);
        return merge(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
       ArrayList<ListNode> arr=new ArrayList<>();
        for(ListNode ele: lists) arr.add(ele);
         int length=arr.size();
         if(length==0) return null;
         return dnq(0,length-1,arr);

    }
}