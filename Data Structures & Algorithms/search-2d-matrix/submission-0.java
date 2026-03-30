class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c  = matrix[0].length;

    int top = 0;
    int bot = r-1;
    while(top <= bot){
int mid = (top+bot)/2;
if(matrix[mid][0] > target){
    bot =  mid -1;

}else if(matrix[mid][c-1] < target){
    top = mid + 1;
}else{
    break;
}
    }

int mid = (top + bot)/2;
int l = 0;
int h = c -1;
while(l <= h){
    int m = (l+h)/2;
    if(matrix[mid][m] > target){
        h = m-1;
    }else if(matrix[mid][m] < target){
        l = m+1;
    }else{
        return true;
    }
}
return false;
    }
}
