class Solution {
    public int reverse(int x) {
        int sign=x>=0? 1:-1;
        int rev=0;
        for(int i=Math.abs(x);i>0;i=i/10){
            int lastDigit=i%10;
            //INT_MAX value (2147483647)
            if(rev > Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && lastDigit >7)) return 0;
            
            //INT_MIN value (-2147483648)
            if(rev < Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && lastDigit <-8)) return 0;
            rev=rev*10+lastDigit;
        }
        
        return rev*sign;
        
    }
}