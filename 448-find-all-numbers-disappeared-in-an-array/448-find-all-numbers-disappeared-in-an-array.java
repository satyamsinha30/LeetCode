class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int newIndex=Math.abs(nums[i])-1;
            if(nums[newIndex]>0)
                nums[newIndex]*=-1;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]>0)
                result.add(i);
        }
        return result;
        //Method 1 (Trivial)
        // Set<Integer> setNums=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     setNums.add(nums[i]);
        // }
        // List<Integer> result= new ArrayList<>();
        // for(int i=1;i<=nums.length;i++){
        //     if(!setNums.contains(i))
        //         result.add(i);
        // }
        // return result;
    }
}