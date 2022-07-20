class Solution {
    public int[] sortArray(int[] nums) {
        // mergeSort(nums,0,nums.length);
        quickSort(nums,0,nums.length);
        return nums;
    }
    
    //Method: 2(Quick Sort)
    private void quickSort(int[] nums,int start,int end){
        if(end-start<2)
            return;
        int pivotIndex=partition(nums,start,end);
        quickSort(nums,start,pivotIndex);
        quickSort(nums,pivotIndex+1,end);
    }
    
    private int partition(int[] nums,int start,int end){
        //Taking pivotElement as starting of array.
        int pivotElement=nums[start];
        int i=start;
        int j=end;
        while(i<j){
            
            //Empty loop body
            while(i<j && nums[--j]>=pivotElement);
            if(i<j){
                nums[i]=nums[j];
            }
            
            //Empty loop body
            while(i<j && nums[++i]<=pivotElement);
            if(i<j){
                nums[j]=nums[i];
            }
        }
        nums[j]=pivotElement;
        return j;
        
    }
    
    
    //Method:1 (Merge Sort)
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