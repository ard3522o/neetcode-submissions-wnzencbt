class Solution {
    public int maxArea(int[] heights) {
       int n = heights.length;
       int ans = 0;
       
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int n1 = Math.min(heights[i], heights[j]);
                int n2 = j - i;
                int mul = n1*n2;
  ans = Math.max(ans, mul);
            }
          
        }
        return ans;
    }
}
