class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums.length){
            int ele=nums[i];
     if(nums[i]==i+1 || nums[i]==nums[ele-1]) i++;
            else{
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        for( i=0;i<nums.length;i++){
          if( nums[i]!=i+1){
             list.add(i+1);
          }

        }
       return list;
} }