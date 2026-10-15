class Solution {
    public int findDuplicate(int[] nums) {
       int i=0;
       int n=nums.length;
       while(i<n) {
       
        
            int temp=nums[i];
            nums[i]=nums[temp];
            nums[temp]=temp;
            if(nums[i]==nums[nums[i]]){
                return nums[i];
            }
        }
        return -1;
       }
       
    }
