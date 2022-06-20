class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] result=new Integer[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[i] = nums[i];
        
        Arrays.sort(result,(a, b)->Integer.compare(a%2, b%2));
        
        for (int i = 0; i < nums.length; i++)
            nums[i] = result[i];
        return nums;
        
        
        //Method 1 (Trivial Time:O(2N) , Space :O(N))
        // int[] result=new int[nums.length];
        // int p=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%2==0){
        //         result[p]=nums[i];
        //         p++;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%2==1){
        //         result[p]=nums[i];
        //         p++;
        //     }
        // }
        // return result;
    }
}