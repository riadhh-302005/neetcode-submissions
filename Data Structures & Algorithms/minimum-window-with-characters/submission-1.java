class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        int count=t.length();
        int minlen=Integer.MAX_VALUE;
        int left=0,start=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            while(count==0){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }
                char l=s.charAt(left);
                freq[l]++;
                if(freq[l]>0){
                    count++;
                }
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}
