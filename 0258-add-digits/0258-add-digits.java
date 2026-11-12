class Solution {
    public int addDigits(int num) {
        int lastdigit =0;
        while(num>=10){
            int sum=0;
         
           while(num>0){
             lastdigit=num%10;
             num=num/10;
             sum=sum+lastdigit;
            }
            num=sum;
        }
        return num;
    }
}