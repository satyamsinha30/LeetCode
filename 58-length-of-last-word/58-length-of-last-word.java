class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && cnt!=0)
                break;
            else if(s.charAt(i)!=' ')
                cnt++;
        }
        return cnt;
        
    }
}