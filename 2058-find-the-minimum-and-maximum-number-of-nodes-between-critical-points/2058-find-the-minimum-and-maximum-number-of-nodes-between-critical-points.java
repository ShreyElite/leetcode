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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       int []arr=new int[2];
       arr[0]=-1;
       arr[1]=-1;
       ListNode a=head;
       ListNode b=a.next;
       ListNode c=a.next.next;
       int lastidx=-1,idx=1,firstidx=-1,mindis=Integer.MAX_VALUE,maxdis=-1;
       if(c==null) return arr;
       while(c!=null){
         if(b.val>c.val && b.val>a.val || b.val<c.val && b.val<a.val){
           if(firstidx==-1) firstidx=idx;
           else if(lastidx!=-1){
             int dis=idx-lastidx;
             mindis=Math.min(dis,mindis);
           }
           lastidx=idx;
         }
         idx++;
         a=a.next;
       b=b.next;
       c=c.next;
      
       }
       maxdis=lastidx-firstidx;
       if(maxdis==0) maxdis=-1;
       if(mindis==Integer.MAX_VALUE) mindis=-1;
       arr[0]=mindis;
       arr[1]=maxdis;
       return arr;
    }
}