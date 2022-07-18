class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }
    private void mergeSort(int[] nums,int start,int end){
        if(end-start<2)
            return;
        int mid=end-(end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid,end);
        merge(nums,start,mid,end);
    }
    private void merge(int[] nums,int start,int mid,int end){
        if(nums[mid-1]<=nums[mid])
            return;
        int[] temp=new int[end-start];
        int tempIndex=0;int i=start;int j=mid;
        while(i<mid && j<end){
            temp[tempIndex++]=nums[i]<=nums[j]?nums[i++]:nums[j++];
        }
        System.arraycopy(nums,i,nums,start+tempIndex,mid-i);
        System.arraycopy(temp,0,nums,start,tempIndex);
    }
}