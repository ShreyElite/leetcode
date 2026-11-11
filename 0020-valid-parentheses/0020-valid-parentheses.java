class Solution {
    public boolean is(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
              if( st.size()==0) return false;
             else if(samestyle(st.peek(),ch)) st.pop();
              else return false;
            }

        }
        return (st.size()==0)  ;

    }
    public boolean samestyle(char a,char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;

    }
    public boolean isValid(String s) {
        return is(s);
    }
}