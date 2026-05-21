class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj=nums.length/3;
        List<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>maj && !res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        return res;

    }
}