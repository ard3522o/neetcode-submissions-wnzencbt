class Solution {
    public int largestRectangleArea(int[] heights) {
int area = 0;
int n = heights.length;
      for(int i=0;i<n;i++){
        int left = i;
        int right = i+1;
        while(left >= 0 && heights[left] >= heights[i]){
            left--;
        }
        while(right <n  && heights[right] >= heights[i]){
            right++;
        }
        left++;
        right--;
        area = Math.max(area, heights[i]*(right-left+1));
      }  
      return area;
    }
}
