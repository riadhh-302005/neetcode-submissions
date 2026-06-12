class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
             boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                if(stack.peek()<Math.abs(asteroids[i])){
                    stack.pop();
                    continue;
                }
                else if(stack.peek()==Math.abs(asteroids[i])){
                    stack.pop();
                    destroyed=true;
                }
                destroyed = true;
                break;
            }
            if(!destroyed){
                stack.push(asteroids[i]);
            }
        }
        int[] ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;       
    }
}