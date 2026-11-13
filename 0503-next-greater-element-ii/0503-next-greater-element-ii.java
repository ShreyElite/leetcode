class Solution {
    public int[] nextGreaterElements(int[] arr) {
          
        int n=arr.length;
        int []out=new int[n];
        Stack<Integer> st=new Stack<>();
       for(int i=arr.length-1;i>=0;i--){
       st.push(arr[i]);
       }
        
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()) st.pop();
            if(st.size()==0) out[i]=-1;
            else out[i]=st.peek();
            st.push(arr[i]);
        }
       
        
        return out;
    }
}