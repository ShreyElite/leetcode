class Solution {
    public boolean is(int c,int []arr,int d){
        int load=0;
        int das=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=c) load+=arr[i];
            else {
                load=arr[i];
                das++;
            }
        }
        if(das>d) return false ;
        else return true;
    }
    public int shipWithinDays(int[] arr, int days) {
           int mx=0;
           int sum=0;
           for(int i=0;i<arr.length;i++){
            if(arr[i]>mx) mx=arr[i];
            sum+=arr[i];
           }
           int low=mx; int high=sum; int minc=sum;
           while(low<=high){
            int mid=low+(high-low)/2;
            if(is(mid,arr,days)==true){
                minc=mid;
                high=mid-1;
            }
            else low=mid+1;
           }
           return minc;
    }
}