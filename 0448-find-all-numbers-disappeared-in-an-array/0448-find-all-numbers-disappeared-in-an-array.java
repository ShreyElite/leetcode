class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
       int i=0;
       while(i<nums.length){
        
        if( nums[i]==i+1 || nums[i]==nums[nums[i]-1]){
            i++;
        }
        else{
            int temp=nums[i];
            nums[i]=nums[temp-1];
            nums[temp-1]=temp;
        }
       }
       for(i=0;i<nums.length;i++){
          if(nums[i]!=i+1){
            list.add(i+1);
          }
       }
       return list;
} }