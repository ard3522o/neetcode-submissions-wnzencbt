class Solution {
    public void setZeroes(int[][] matrix) {
    int n  = matrix.length;
    int m = matrix[0].length;
    boolean[] row = new boolean[n];
    boolean[] col = new boolean[m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
        }
    }
       for(int l=0;l<n;l++){
        for(int k=0;k<m;k++){
if(row[l] || col[k]){
    matrix[l][k] = 0;
}
        
       }  
    }    
    }
}
