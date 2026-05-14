class Solution {
    public void rotate(int[][] matrix) {
    transpose(matrix);
    swap(matrix);    
    }
    public void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                if(i == j) continue;
                else{
                    int temp = matrix[i][j];

                     matrix[i][j] = matrix[j][i]  ;
                     matrix[j][i] = temp;
                }
            }
        }
    }
    public void swap(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-1-j];
                matrix[i][m-1-j] = temp;

            }
        }
    }
}
