class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        int n=nums.length;
        while(i<nums.length){
            int ele=nums[i];
            if(ele==i+1 || ele>n || ele<=0 || ele==nums[ele-1]  ){
                i++; 
            }
            else {
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }

              i=0;
         while(i<n){
            if( nums[i]!=i+1 ){
                return i+1;
            }
            else i++;
        }
       
        return i+1;
    }
}