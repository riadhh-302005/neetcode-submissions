class Solution {

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int requiredDays = 1;
            int currWeight = 0;
            for (int i = 0; i < n; i++) {
                if (currWeight + weights[i] > mid) {
                    requiredDays++;
                    currWeight = 0;
                }
                currWeight += weights[i];
            }
            if (requiredDays > days) {
                left = mid + 1;
            }
            else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }
}