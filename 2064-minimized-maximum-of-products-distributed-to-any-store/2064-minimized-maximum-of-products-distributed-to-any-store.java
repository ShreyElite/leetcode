class Solution {
    public boolean isp(int h,int []arr,int n){
     int stores=0;
     for(int i=0;i<arr.length;i++){
            if(arr[i]%h==0) stores+=arr[i]/h;
            else    stores +=(arr[i]/h)+1;
     }
     if(stores>n) return false ;
     else return true;
    }
    public int minimizedMaximum(int n, int[] q) {
         int s=0,mx=0;
         int low=1;
         for(int i=0;i<q.length;i++){
            if(mx<q[i]) mx=q[i];
         }
        int  high=mx;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isp(mid,q,n)==true){
                    s=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
             return s;  
          }
        }