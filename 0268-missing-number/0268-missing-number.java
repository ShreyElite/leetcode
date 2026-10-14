class Solution {
    public void swap(int i,int j,int []nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<nums.length){
            if(nums[i]==n || nums[i]==i) i++;
            else{
                swap(i,nums[i],nums);
            }

        
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return i;
    }
}