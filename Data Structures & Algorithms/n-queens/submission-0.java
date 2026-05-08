class Solution {
    public List<List<String>> solveNQueens(int n) {
      char[][] board =  new char[n][n]  ;
      List<List<String>> res = new ArrayList<>();
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            board[i][j] = '.';
        }
      }
      backtrack(0, board, res);
      return res;
    }
    void backtrack(int row, char[][] board, List<List<String>> res){
        if(row == board.length){
            res.add(construct(board));
            return;
            }
        for(int col=0;col<board.length;col++){
            if(isValid(row, col, board)){
                board[row][col] = 'Q';
                backtrack(row+1, board, res);
                board[row][col] = '.';
            }
        }
    }
    public boolean isValid(int row, int col, char[][] board){
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q') return false;
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
    List<String> construct(char[][] board){
        List<String> path = new  ArrayList<>();
        for(int i=0;i<board.length;i++){
            path.add(new String(board[i]));
        }
        return path;
    }
}
