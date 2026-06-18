class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        int length=points.length;
        for(int i=0;i<length;i++){
            int distance=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.offer(new int[]{distance,i});
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            int[] curr=pq.poll();
            int idx=curr[1];
            ans[i][0]=points[idx][0];
            ans[i][1]=points[idx][1];
        }
        return ans;
    }
}
