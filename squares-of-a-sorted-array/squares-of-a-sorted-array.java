class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int negative=-1,positive=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<0)
                negative=i;
        }
        positive=negative+1;
        int p=0;
        int[]  result=new int[nums.length];
        while(negative>=0 && positive<n){
            if(Math.abs(nums[negative])<=nums[positive]){
                result[p]=nums[negative];
                negative--;p++;
            }else{
                result[p]=nums[positive];
                positive++;p++;
            }
        }
        while(negative>=0){
            result[p]=nums[negative];
            negative--;p++;
        }
        while(positive<n){
            result[p]=nums[positive];
            positive++;p++;
        }
        for(int i=0;i<n;i++){
            result[i]=result[i]*result[i];
        }
        return result;
    }
}