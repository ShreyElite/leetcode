class Solution {
   // public void stack(Stack<String> st){
 //       if(st.size()==0) 
   // }
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()) st.push(s.charAt(i));
            else if(st.peek()!=s.charAt(i)){
                  st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
         StringBuilder ans=new StringBuilder("");
             while(st.size()>0){
                ans.append(st.pop());
        }
        ans.reverse();
        return  ans.toString();
      
    }
}