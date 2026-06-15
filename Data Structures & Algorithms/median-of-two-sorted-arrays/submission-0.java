class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=n1+n2;
        int[] ans=new int[n3];
        int i=0,j=0,left=0;;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                    ans[left]=nums1[i];
                    i++;
                    left++;
            }
            else{
                ans[left]=nums2[j];
                j++;
                left++;
            }
        }
        while(i<n1){
            ans[left]=nums1[i];
            i++;
            left++;
        }
        while(j<n2){
            ans[left]=nums2[j];
            j++;
            left++;
        }
        if((n3)%2==0){
            return (ans[n3/2-1]+ans[n3/2])/2.0;
        }
        else{
            return ans[n3/2];
        }

    }
}
