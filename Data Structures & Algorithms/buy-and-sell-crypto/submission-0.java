class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=100;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
