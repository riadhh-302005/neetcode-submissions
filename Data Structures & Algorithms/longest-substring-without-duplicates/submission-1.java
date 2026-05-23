class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            if(!set.isEmpty() && set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                
            }
            else{
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
                right++;
            }
        }
        return max;
    }
}
