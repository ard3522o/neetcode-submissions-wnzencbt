class Solution {
    int n;
    int m;
    public void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O'){
                board[i][0] = 'T'; 
            }
            if(board[i][m-1] == 'O'){
                board[i][m-1] = 'T';
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i] == 'O'){
                board[0][i] = 'T';
            }
            if(board[n-1][i] == 'O'){
                board[0][i] = 'T';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'T') board[i][j] = 'O';
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';

                }
            }
        }
    }
}
