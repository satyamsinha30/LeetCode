class Solution {
    public int findNumbers(int[] nums) {
        int cntEven=0;
        for(int i=0;i<nums.length;i++){
            if(isEvenDigits(nums[i])){
                cntEven++;
            }
        }
        return cntEven;
    }
    private boolean isEvenDigits(int num){
        if(num==0)
            return false;
        int digits=0;
        for(int i=num;i>0;i=i/10){
            digits++;
        }
        if(digits%2==0)
            return true;
        else
            return false;
        
    }
}