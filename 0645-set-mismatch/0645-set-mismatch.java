class Solution {
    public int[] findErrorNums(int[] nums) {
       int []arr=new int[2];
       int n=nums.length;
      int i=0;
       
      while(i<nums.length){
            if(nums[i]==i+1 || nums[i]==n  || nums[i]==nums[nums[i]-1]){
                i++; 
            }
           
            else{

                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
          
          for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                arr[1]=i+1;
                arr[0]=nums[nums[i]-1];
                break;
            }
           
          }
          return arr;
    }
}