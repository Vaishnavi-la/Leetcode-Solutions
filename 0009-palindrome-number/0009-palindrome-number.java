class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
       int digit ;
       int reverse=0;
       while(x!=0){
        digit=x%10;
        x=x/10;
        reverse=(reverse*10)+digit;
       } 
       if(reverse < 0){
        return false;
       }
       else{
        return reverse== original ;
       }
    }
}