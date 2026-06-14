class Solution {
    public int findTargetSumWays(int[] nums, int target) {
   int n = nums.length;
   int sum =0;
   for(int i=0;i<n;i++){
sum += nums[i];
   }  
      if(Math.abs(target) > sum || (target + sum)%2 != 0)return 0;

      int s1 = (target + sum)/2;
      int[][] dp = new int[n+1][s1+1];
      for(int i=0;i<=n;i++){
dp[i][0] = 1;
      }
     for(int i=1;i<=n;i++){
        for(int j=0;j<=s1;j++){
            int take = 0;
            if(nums[i-1] <= j){
take = dp[i][j-nums[i-1]];
            }
            int notake = dp[i-1][j];
            dp[i][j] = take + notake;
        }
     }
     return  dp[n][s1];
    }
}
