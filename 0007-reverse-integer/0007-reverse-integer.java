class Solution {
    public int reverse(int x) {
        int lastdigit;
        int reverse= 0;
        while(x!=0){
            lastdigit = x%10;
            x=x/10;
          if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            reverse = (reverse * 10) + lastdigit;
        }
     return reverse;
    }
   
}