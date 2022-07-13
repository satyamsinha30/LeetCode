class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==0) return false;
        int cnt=0;
        for(int i=n;i>0;i=i>>1){
            if((i&1)==1){
                cnt++;
            }
        }
        return cnt==1;
    }
}