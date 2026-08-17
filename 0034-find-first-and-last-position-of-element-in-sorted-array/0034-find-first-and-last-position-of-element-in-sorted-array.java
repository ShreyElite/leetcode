class Solution {
    public int[] searchRange(int[] nums, int x) {
        int low=0,high=nums.length-1;
        int fp=0;
        int lp=0;
        int []arr={-1,-1};
         
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=x){
                high=mid-1;
            }
            else low=mid+1;
        }
        fp=low;
        low=fp;high=nums.length-1;
        while(low<=high){
           int mid=low+(high-low)/2;
           if(nums[mid]>x){
            high=mid-1;
           }
           else low=mid+1;
        }
        lp=low-1;
         if(fp<nums.length && fp<=lp && nums[fp]==x) {
            arr[0]=fp;
            arr[1]=lp;
            return arr;
         }
         return arr;
    }
}