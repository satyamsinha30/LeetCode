class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--)
                    arr[j]=arr[j-1];
                if(i+1<arr.length) 
                    arr[i+1]=0;
                i++;
            }
        }
        // int[] result=new int[arr.length];
        // int k=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         result[k]=0;
        //         k=k+1;
        //         if(k>=arr.length){
        //          break;   
        //         }
        //         result[k]=0;
        //     }else{
        //         result[k]=arr[i];
        //     }
        //     k++;
        //     if(k>=arr.length)
        //         break;
        // }
        // arr=result;
    }
}