class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a[0]!=b[0]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            }
        );
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new int[]{Math.abs(arr[i]-x),arr[i]});
        }
        for(int i=0;i<k;i++){
            int[] temp=pq.poll();
            res.add(temp[1]);
        }
        Collections.sort(res);
        return res;
    }
}