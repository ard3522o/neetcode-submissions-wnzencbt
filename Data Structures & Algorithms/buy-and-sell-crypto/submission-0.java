class Solution {
    public int maxProfit(int[] prices) {
   int n = prices.length;
   int ans = 0;
   for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
        if(prices[j] > prices[i]){
            int diff = prices[j] - prices[i];
ans = Math.max(ans, diff);
        }
    }
   }     
   return ans;
    }
}
