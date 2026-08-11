class Solution {
    public int smallestDivisor(int[] nums, int t) {
      int mx=-57567;
      int n=nums.length;
      for(int i=0;i<n;i++)  {
        if(nums[i]>mx){
            mx=nums[i];
        }
      }
      int d=1;
      int sum=0;
      int low=1,high=mx;
      while(low<=high){
        int mid=low+(high-low)/2;
        sum=0;
        for(int i=0;i<n;i++){
           if(nums[i]%mid==0) sum+=nums[i]/mid;
           else sum+=(nums[i]/mid)+1;
        }
        if(sum<=t){
            d=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return d;
    }
}