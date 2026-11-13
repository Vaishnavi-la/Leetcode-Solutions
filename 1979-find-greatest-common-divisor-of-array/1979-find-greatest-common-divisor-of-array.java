class Solution {
    public int findGCD(int[] nums) {
         int a = nums[0];
        int b = nums[0];

        for (int num : nums) {
            a = Math.min(a, num);
            b = Math.max(b, num);
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}