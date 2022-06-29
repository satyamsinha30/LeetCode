class Solution {
    private int prime=31;
    private long calculateHash(char[] str,int size){
        long hash=0;
        for(int i=0;i<=size;i++)
            hash+=str[i]*Math.pow(prime,i);
        return hash;
    }
    private long recalculateHash(char[] str,int oldIndex,int newIndex,long oldHash,int patternLen){
        long newHash=oldHash-str[oldIndex];
        newHash=newHash/prime;
        newHash+=str[newIndex]*Math.pow(prime,patternLen-1);
        return newHash;
        
    }
    private boolean checkEqual(char[] str1,int start1,int end1,char[] str2,int start2,int end2){
        if(end1-start1 != end2-start2)
            return false;
        while(start1<=end1 && start2<=end2){
            if(str1[start1]!=str2[start2])
                return false;
            start1++; start2++;
        }
        return true;
    }
    private int[] computeLps(char[] pattern){
        int[] lps=new int[pattern.length];
        int i=0,j=1;
        while(j<pattern.length){
            if(pattern[j]==pattern[i]){
                lps[j]=i+1;
                i++;j++;
            }else{
                if(i!=0){
                    i=lps[i-1];
                }else{
                    lps[j]=0;
                    j++;
                }
            }
        }
        return lps;
    }
    private int KMP(char[] text,char[] pattern){
        int[] lps=computeLps(pattern);
        int i=0,j=0;
        while(i<text.length && j<pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j== pattern.length)
            return i-j;
        else 
            return -1;
    }
    public int strStr(String haystack, String needle) {
        return KMP(haystack.toCharArray(),needle.toCharArray());
        
        // char[] text=haystack.toCharArray();
        // char[] pattern=needle.toCharArray();
        // int m=pattern.length;
        // int n=text.length;
        // if(m>n)
        //     return -1;
        // long hashPattern=calculateHash(pattern,m-1);
        // long hashText=calculateHash(text,m-1);
        // for(int i=1;i<=n-m+1;i++){
        //     if(hashPattern==hashText && checkEqual(pattern,0,m-1,text,i-1,i+m-2)){
        //         return i-1;
        //     }
        //     if(i<n-m+1)
        //         hashText=recalculateHash(text,i-1,i+m-1,hashText,m);
        // }
        // return -1;
        
        //Brute force(Trivial)
//         int M=haystack.length();
//         int N=needle.length();
//         if(N==0) return 0;
//         for(int i=0;i<M-N+1;i++){
//             int j;
//             for(j=0;j<N;j++){
//                 if(!(needle.charAt(j)==haystack.charAt(i+j)))
//                     break;
//             }
//             if(j==N)
//               return i;
            
//         }
//         return -1;
        
    }
}