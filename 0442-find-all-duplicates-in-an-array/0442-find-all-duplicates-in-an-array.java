class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){ 
            if(nums[i]==i+1  ){
                i++;
            }
             else if(nums[i]==nums[nums[i]-1] ){
                
               
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
                list.add(nums[i]);
            }
        }
         

        return list;
    }
}