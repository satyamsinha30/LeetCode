class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if( (  ((int)s.charAt(i))>=97 && ((int)s.charAt(i))<=122 ) ||( ((int)s.charAt(i))>=48 && ((int)s.charAt(i))<=57 ))
                st.append(s.charAt(i));
        }
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                return false;
            }
        }
        return true;
        
        
    }
}