class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0;
        int ten=0;
        int fifteen=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five<1){
                    return false;
                }
                else{
                    five--;
                    ten++;
                }
            }
            else if(bills[i]==15){
                if(ten>=1){
                    fifteen++;
                    ten--;
                }
                else if(five>=2){
                    five-=2;
                    fifteen++;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}