class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> setNums=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            setNums.add(nums[i]);
        }
        List<Integer> result= new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!setNums.contains(i))
                result.add(i);
        }
        return result;
    }
}