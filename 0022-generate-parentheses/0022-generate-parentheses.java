class Solution {
    public void str(int l,int r ,List<String> ans,String s,int n){
    if(r==n){
        ans.add(s);
        return;
    }
    if(l<n){
        str(l+1,r,ans,s+"(",n);
    }
    if(r<l){
        str(l,r+1,ans,s+")",n);
    }

    }
    public List<String> generateParenthesis(int n) {
       List<String> ans=new ArrayList<>();
         str(0,0 ,ans,"",n);
        
       return ans;
    }
}