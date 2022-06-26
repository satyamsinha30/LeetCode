class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0)
            return new int[0];
        int M=mat.length;
        int N=mat[0].length;
        int[] result=new int[N*M];int k=0;
        List<Integer> intermediate=new ArrayList<>();
        for(int d=0;d<N+M-1;d++){
            intermediate.clear();
            int r=d<N ? 0: (d-N+1);
            int c=d<N ? d: (N-1);
            
            while(r<M && c>-1){
                intermediate.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(intermediate);
            }
            for(int i=0;i<intermediate.size();i++)
                result[k++]=intermediate.get(i);
        }
        
        return result;
    }
}