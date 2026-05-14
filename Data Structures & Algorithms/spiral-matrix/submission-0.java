class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> ans = new ArrayList<>();
     int l =  0;
     int r = matrix[0].length;
     int top = 0;
     int bottom = matrix.length;
     while(l < r && top < bottom){
        for(int i=l;i<r;i++){
ans.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<bottom;i++){
            ans.add(matrix[i][r-1]);

        }
        r--;
        if(!(top < bottom && l < r)){
            break;
        }
        for(int i=r-1;i>=l;i--){
         ans.add(matrix[bottom-1][i]);   
        }
        bottom--;
        for(int i=bottom-1;i>=top;i--){
            ans.add(matrix[i][l]);
        }
l++;
     } 
     return ans;  
    }
}
