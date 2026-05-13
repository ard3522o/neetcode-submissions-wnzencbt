class Solution {
     int INF = 2147483647;
    int n;
    int m;
int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public void islandsAndTreasure(int[][] grid) {
       n = grid.length;
       m = grid[0].length;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j] == INF){
                grid[i][j] = bfs(i, j, grid);
            }
        }
      }  

    }
    public int bfs(int r , int c, int[][] grid){
     Queue<int []> q = new LinkedList<>();
     q.offer(new int[]{r, c});
     boolean[][] visit = new boolean[n][m];
     visit[r][c] =  true;
     int steps = 0;
     while(!q.isEmpty()){
        int len  = q.size();
       for(int i=0;i<len;i++){
        int[] arr = q.poll();
        int rw = arr[0];
        int cw = arr[1];
        if(grid[rw][cw] == 0) return steps;
        for(int[] dir : directions){
            int nr = rw+dir[0];
            int nc = cw+dir[1];
            if(nr >=0 && nr < n && nc >= 0 && nc < m && !visit[nr][nc] && grid[nr][nc] != -1){
                visit[nr][nc] = true;
                q.add(new int[]{nr, nc});
            }
            

        }
       }
       steps++; 

     }  
     return INF; 
    }
}
