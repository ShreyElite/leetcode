class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length];
        int i=0,j=0;
        while(i<nums1.length){
               while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    break;
                }
               j++;
               }
              
                 while(j<nums2.length){
                   if(nums1[i]<nums2[j]) {
                   arr[i]=nums2[j];
                   break;
                 }
                 j++;
               }
               
                if(j==nums2.length) arr[i]=-1;
            j=0;
             i++;
            
                }
            return arr;
            }
        }
        

    
