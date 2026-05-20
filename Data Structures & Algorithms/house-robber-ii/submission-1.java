class Solution {
    int[][] memo;
    public int rob(int[] nums) {
      int n = nums.length;
      memo = new int[n][2];
      for(int i=0;i<n;i++){
        memo[i][0] = -1;
        memo[i][1] = -1;

      } 
      return Math.max(dfs(0, 1, nums), dfs(1, 0, nums)); 
    }
    int dfs(int i, int flag, int[] nums){
        if(i >= nums.length || (flag == 1 && i == nums.length - 1))return 0;
        if(memo[i][flag] != -1) return memo[i][flag];

        memo[i][flag] = Math.max(dfs(i+1, flag, nums), nums[i]+dfs(i+2, flag, nums));
        return memo[i][flag];
    }
}
