class Solution {
    public int maxProduct(int[] nums) {
     int res =nums[0];
     int ms  = 1;
     int mis =1;

     for(int num : nums){
        int temp = ms*num;
        ms = Math.max(num, Math.max(num*ms, num*mis));
        mis = Math.min(num, Math.min(temp, mis));

        res =  Math.max(res, ms);

     }   
     return res;
    }
}
