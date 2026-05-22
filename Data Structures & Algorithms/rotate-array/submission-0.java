class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        while(count<k){
            int val=nums[n-1];
            for(int i=n-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=val;
            count++;
        }
    }
}