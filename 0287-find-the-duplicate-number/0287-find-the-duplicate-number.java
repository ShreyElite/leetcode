class Solution {
    public int findDuplicate(int[] nums) {
      
       while(true) {
       
         if(nums[0]==nums[nums[0]]){
                return nums[0];
            }
            int temp=nums[0];
            nums[0]=nums[temp];
            nums[temp]=temp;
           
        }
        
       }
       
    }
