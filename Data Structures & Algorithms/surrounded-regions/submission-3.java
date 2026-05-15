class Solution {
    int n;
    int m;
    int[][] directions = {{1, 0}, {-1,  0}, {0, 1}, {0, -1}};
    public void solve(char[][] board) {
        
        n = board.length;
        m = board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][m-1] == 'O'){
                dfs(board, i, m-1);
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i] == 'O'){
               dfs(board, 0, i);
            }
            if(board[n-1][i] == 'O'){
              dfs(board, n-1, i);
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
    void dfs(char[][] board, int r, int c){
        if(r <0 || c<0  || r >= n || c>=m || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'T';
        for(int[] dir : directions){
            int nr = r + dir[0];
            int nc = c + dir[1];
            dfs(board, nr, nc);
        }

    }
}
