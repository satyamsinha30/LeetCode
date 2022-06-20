class Solution {
    public int thirdMax(int[] nums) {
        //Method 2
        Set<Integer>maximum=new HashSet<>();
        for(int num:nums){
            maximum.add(num);
            if(maximum.size()>3){
                maximum.remove(Collections.min(maximum));
            }
        }
        if(maximum.size() ==3){
            return Collections.min(maximum);
        }
        return Collections.max(maximum);
        
        //Method 1:
        // Set<Integer> numSets=new HashSet<>();
        // for(int num:nums)
        //     numSets.add(num);
        // int maximum=Collections.max(numSets);
        // if(numSets.size() < 3)
        //     return maximum;
        // numSets.remove(maximum);
        // int secondMaximum=Collections.max(numSets);
        // numSets.remove(secondMaximum);
        // return Collections.max(numSets);
    }
}