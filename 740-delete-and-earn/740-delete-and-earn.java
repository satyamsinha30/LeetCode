class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> points=new HashMap<>();
        int maxNumber=nums[0];
        for(int i=0;i<nums.length;i++){
            points.put(nums[i],points.getOrDefault(nums[i],0)+nums[i]);
            maxNumber=Math.max(maxNumber,nums[i]);
        }
        
        int[] maxPoints=new int[maxNumber+1];
        maxPoints[1]=points.getOrDefault(1,0);
        for(int i=2;i<=maxNumber;i++){
            int gain= points.getOrDefault(i,0);
            maxPoints[i]=Math.max(maxPoints[i-1],maxPoints[i-2]+gain);
        }
        return maxPoints[maxNumber];
        
    }
}