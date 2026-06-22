class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totalgas=0;
        int total=0;
        int start=0;
        for(int i=0;i<n;i++){
            int diff=gas[i]-cost[i];
            total+=diff;
            totalgas+=diff;
            if(totalgas<0){
                start=i+1;
                totalgas=0;
            }
        }
        return total<0 ? -1 : start;
    }
}
