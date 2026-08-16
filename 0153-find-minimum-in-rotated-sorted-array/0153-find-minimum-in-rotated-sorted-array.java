class Solution {
    public int findMin(int[] arr) {
       int low=0,high=arr.length-1;
       int n=arr.length;
       int mid=0;
       
        while(low<high){
            mid=low+(high-low)/2;
    
      if(arr[mid]>arr[high]){
            low=mid+1;
           }
           else {
            high=mid;
           }

        }
        return arr[low];
    }
}