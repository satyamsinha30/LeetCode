class Solution {
    public int strStr(String haystack, String needle) {
        int M=haystack.length();
        int N=needle.length();
        if(N==0) return 0;
        for(int i=0;i<M-N+1;i++){
            int j;
            for(j=0;j<N;j++){
                if(!(needle.charAt(j)==haystack.charAt(i+j)))
                    break;
            }
            if(j==N)
              return i;
            
        }
        return -1;
        
    }
}