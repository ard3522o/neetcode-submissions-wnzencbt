class Solution {
    public int maxSubArray(int[] nums) {
      int res = nums[0];
      int ms = nums[0];
      for(int i=1;i<nums.length;i++){
        ms = Math.max(nums[i], nums[i]+ms);
        res = Math.max(res, ms);
      }  
      return res;
    }
}
