class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int minlen=100;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum=sum-nums[left];
                left++;
            }
            right++;
        }
        return minlen==100?0:minlen;
    }
}