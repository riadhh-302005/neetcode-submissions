class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxfreq=0;
        int maxchar=0;
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                maxchar=i;
            }
        }
        if(maxfreq>(n+1)/2){
            return "";
        }
        int idx=0;
        char[] ans=new char[n];
        while(freq[maxchar]>0){
            ans[idx]=(char)(maxchar+'a');
            idx+=2;
            freq[maxchar]--;
        }
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                if (idx >= n){
                    idx=1;
                }
                ans[idx]=(char)(i+'a');
                idx+=2;
                freq[i]--;
            }
        }
        return new String(ans);
    }
}