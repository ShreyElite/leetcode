class Solution {
    public int[] canSeePersonsCount(int[] he) {
        Stack<Integer> stack=new Stack<>();
        int n=he.length;
        int []ans=new int[n];
        ans[n-1]=0;
        stack.push(he[n-1]);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(stack.size()>0 && stack.peek()<=he[i]){
                count++;
                stack.pop();
            }
            if(stack.size()>0) count++;
            ans[i]=count;
            stack.push(he[i]);
            
        }
        return ans;
    }
}