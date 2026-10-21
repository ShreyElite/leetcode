class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i]=nums[i]*nums[i];
        }  
        int i=0; int j=nums.length-1;
        int k=nums.length-1;
        int []arr=new int [nums.length];
         while(i<=j){
            if(nums[i]>nums[j]){
                arr[k]=nums[i];
                  i++;
                  k--;
                
            }
             else{
                arr[k]=nums[j];
                j--;
                k--;
             }
         }
        return arr;
    }
}