class Solution {
    public int change(int amount, int[] coins) {
     int n = coins.length;
     int[][] dp = new int[n+1][amount+1];

     for(int i=0;i<n;i++){
        dp[i][0] = 1;

     }  
     for(int i=1;i<=n;i++){
        for(int j=0;j<=amount;j++){
            int take = 0;
            if(coins[i-1] <= j){
take = dp[i][j-coins[i-1]];
            }
            int notake = dp[i-1][j];
            dp[i][j] = take + notake;
        }
     }
     return dp[n][amount]; 
    }
}
