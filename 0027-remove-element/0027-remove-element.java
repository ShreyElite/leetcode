class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){

            list.add(nums[i]);
            k++;
           }
        }
        for(int j=0;j<list.size();j++){
            nums[j]=list.get(j);
        }
        
         return k;
    }
}