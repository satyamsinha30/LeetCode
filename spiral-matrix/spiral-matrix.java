class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int c1=0,r1=0;
        while(c1<n && r1<m){
                for(int i=c1;i<n;i++){
                    result.add(matrix[r1][i]);
                }
                r1++;
                for(int i=r1;i<m;i++){
                    result.add(matrix[i][n-1]);
                }
                n--;
            if(r1<m){
                for(int i=n-1;i>=c1;i--){
                    result.add(matrix[m-1][i]);
                }
               m--;
            }
            if(c1<n){
                for(int i=m-1;i>=r1;i--){
                    result.add(matrix[i][c1]);
                }
                c1++;
            }
            
        }
        return result;
        
    }
}