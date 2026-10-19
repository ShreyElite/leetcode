class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i=0;
        int n=nums.length;
        while(i<n){
            int ele=nums[i];
            if(ele==i+1 || ele>n || ele<=0 || ele==nums[ele-1]  ){
                i++; 
            }
            else {
                int temp=ele;
                nums[i]=nums[temp-1];
                nums[temp-1]=ele;
            }
        }

              
        for( i=0;i<nums.length;i++){
            if( nums[i]!=i+1 ){
                return i+1;
            }
            
        }
       
        return i+1;
    }
}