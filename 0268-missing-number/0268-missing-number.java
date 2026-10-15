class Solution {
  
    public int missingNumber(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            count+=i+1;
            
         sum+=nums[i];

        }
        
        return count-sum;
    }
}