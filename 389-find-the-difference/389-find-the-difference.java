class Solution {
    public char findTheDifference(String s, String t) {
        char extraChar= '\0';
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
        int cnt=map.getOrDefault(t.charAt(i),0);
        if(cnt==0){
            extraChar=t.charAt(i);
            break;
        }else{
            map.put(t.charAt(i),cnt-1);
        }
        }
        return extraChar;
    }
}