class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<heights.length;i++)
            expected[i]=heights[i];
        Arrays.sort(expected);
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
                cnt++;
        }
        return cnt;
        
    }
}