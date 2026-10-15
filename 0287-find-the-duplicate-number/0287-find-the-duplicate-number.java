class Solution {
    public int findDuplicate(int[] nums) {
       int i=0;
       int n=nums.length;
       while(i<n) {
       
         if(nums[i]==nums[nums[i]]){
                return nums[i];
            }
            int temp=nums[i];
            nums[i]=nums[temp];
            nums[temp]=temp;
           
        }
        return -1;
       }
       
    }
