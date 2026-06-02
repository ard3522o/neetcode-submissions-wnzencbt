class Solution {
    public int maxArea(int[] heights) {
     int temp = 0;
     int ans = 0;
     int n = heights.length;
     for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            temp = Math.min(heights[i], heights[j])*(j-i);

            ans = Math.max(ans, temp);
        }
     }
     return ans;   
    }
}
