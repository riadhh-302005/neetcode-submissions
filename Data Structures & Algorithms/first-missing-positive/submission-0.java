class Solution {
    public int firstMissingPositive(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int left=1;
       for(int i=0;i<n;i++){
        if(nums[i]<1){
            continue;
        }
        if(nums[i]==left){
            left++;
        }

       }
       return left;
       
    }
}