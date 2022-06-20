class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1)
            return 1;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];right[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
                left[i]=left[i-1]+1;
            }else{
                left[i]=0;
            }
            if(nums[nums.length-i-1]==1){
                right[nums.length-i-1]=right[nums.length-i]+1;
            }else{
                right[nums.length-i-1]=0;
            }
        }
        int maxOne=0;
        for(int i=0;i<nums.length;i++){
                int leftOnes=i-1 >=0 ? left[i-1]:0;
                int rightOnes=i+1 <=nums.length-1 ? right[i+1]:0;
                int sum=leftOnes+rightOnes;
                maxOne=Math.max(maxOne,sum+1);
                
        }
        return maxOne;
        
        
    }
}