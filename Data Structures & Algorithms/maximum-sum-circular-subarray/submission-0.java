class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=nums[0];
        int currMin=nums[0];
        int max=nums[0];
        int min=nums[0];
        int totalsum=nums[0];
        for(int i=1;i<nums.length;i++){
            totalsum += nums[i];
            currMax=Math.max(nums[i],currMax+nums[i]);
            max=Math.max(currMax,max);
            currMin=Math.min(nums[i],currMin+nums[i]);
            min=Math.min(currMin,min);
        }
        if(max<0){
            return max;
        }
        return Math.max(max,totalsum-min);
    }
}