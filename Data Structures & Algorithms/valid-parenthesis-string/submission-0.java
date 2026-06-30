class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        Stack<Integer>st=new Stack<>();
        Stack<Integer>star=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else if(ch=='*'){
                star.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!st.isEmpty() && !star.isEmpty()){
            if(st.peek()>star.peek()){
                return false;
            }
            st.pop();
            star.pop();
        }
        return st.isEmpty();
    }
}
