class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max=nums[0];int index=0;
        for(int i=0;i<nums.length;i++){
           if(max<nums[i]){
               max=nums[i];
               index=i;
           }
        }
            
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                if(max < 2*nums[i])
                    return -1;
            }
        }
        return index;
        
    }
}