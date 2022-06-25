class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> reverse=new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--){
            reverse.add(digits[i]);
        }
        int carry=1;
        for(int i=0;i<reverse.size();i++){
            if(carry==1){
                int value=reverse.get(i)+carry;
                if(value>=10){
                    value-=10;
                    carry=1;
                }else{
                    carry=0;
                }
                reverse.set(i,value);
            }
        }
        if(carry==1){
            reverse.add(carry);
        }
        Collections.reverse(reverse);
        int[] result=new int[reverse.size()];
        for(int i=0;i<reverse.size();i++)
            result[i]=reverse.get(i);
        return result;
        
    }
}