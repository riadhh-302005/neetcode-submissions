class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String ch=tokens[i];
            if(ch.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b+a);
            }
            else if(ch.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else if(ch.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b*a);
            }
            else if(ch.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
