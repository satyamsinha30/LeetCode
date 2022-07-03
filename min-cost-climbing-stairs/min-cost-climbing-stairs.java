class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost=new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
            int OneStep=minCost[i-1]+cost[i-1];
            int TwoStep=minCost[i-2]+cost[i-2];
            minCost[i]=Math.min(OneStep,TwoStep);
        }
        return minCost[cost.length];
        
        
    }
}