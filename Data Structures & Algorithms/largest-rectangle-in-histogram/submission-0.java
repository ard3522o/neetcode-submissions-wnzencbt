class Solution {
    public int largestRectangleArea(int[] heights) {
      int maxarea = 0;
      int n = heights.length;
      for(int i=0;i<n;i++){
        int height = heights[i];
        int right = i+1;
        int left = i;
        while(right < n && heights[right] >= height){
            right++;
        }
        while(left >= 0 && heights[left] >= height){
            left--;
        }
        right--;
        left++;
        maxarea = Math.max(maxarea, height*(right -  left + 1));
      } 
      return maxarea; 
    }
}
