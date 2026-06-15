class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(cansplit(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean cansplit(int[] nums,int k,int maxsum){
        int count=1;
        int currentsum=0;
        for(int i=0;i<nums.length;i++){
            if(currentsum+nums[i]<=maxsum){
                currentsum+=nums[i];
            }
            else{
                count++;
                currentsum=nums[i];
            }
        }
        return count<=k;
    }
}