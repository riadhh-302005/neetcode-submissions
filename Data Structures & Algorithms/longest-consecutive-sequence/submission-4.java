class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0||n==1){
            return n;
        }
        Arrays.sort(nums);
        int count=1,max=1;
        for(int i=1;i<n;i++){
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]-nums[i-1]==1){
                count++;
            }
            else{                
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
