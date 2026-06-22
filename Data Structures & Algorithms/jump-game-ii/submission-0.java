class Solution {
    public int jump(int[] nums) {
        int maxreach=0;
        int currend=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++){
           maxreach=Math.max(maxreach,nums[i]+i);
           if(i==currend){
            jumps++;
            currend=maxreach;
           }
        }
        return jumps;
    }
}
