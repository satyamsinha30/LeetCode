class Solution {
    public boolean isPowerOfFour(int n) {
        int cnt=0;
        int cntZero=0;
        for(int i=n;i>0;i=i>>1){
            if((i&1)==0 && cnt==0){
                cntZero++;
            }else{
                cnt++;
            }
        }
        if(cnt==1 & cntZero%2==0){
            return true;
        }else{
            return false;
        }
    }
}