class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        int n=operations.length;
        int sum=0;
        for(int i=0;i<n;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else if(ch.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(ch.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}