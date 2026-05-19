class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] res=new int[n];
        int i=0,j=0;
        while(i<n){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}