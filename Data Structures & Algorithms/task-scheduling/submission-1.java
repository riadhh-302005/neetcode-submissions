class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(
            (a,b)->b-a
        );
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                maxheap.offer(freq[i]);
            }
        }
        int time=0;
        while(!maxheap.isEmpty()){
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(!maxheap.isEmpty()){
                    int count=maxheap.poll();
                    count--;
                    if(count>0){
                        list.add(count);
                    }
                }
                time++;
                if(maxheap.isEmpty() && list.isEmpty()){
                    break;
                }
            }
            for(int i=0;i<list.size();i++){
                    maxheap.offer(list.get(i));
            }
        }
        return time; 
    }
}
