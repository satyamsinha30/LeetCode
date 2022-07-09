class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int max_sq_index=(int)Math.sqrt(n)+1;
        int sq_nums[]=new int[max_sq_index];
        for(int i=1;i<max_sq_index;i++){
            sq_nums[i]=i*i;
        }
        for(int i=1;i<=n;i++){
            for(int s=1;s<max_sq_index;s++){
                if(i<sq_nums[s])
                    break;
                dp[i]=Math.min(dp[i],dp[i-sq_nums[s]]+1);
            }
        }
        return dp[n];
        
    }
}