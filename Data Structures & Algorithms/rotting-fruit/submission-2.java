class Solution {
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Queue<int[]> q = new LinkedList<>();
    int time = 0;
    int fresh = 0;
    boolean[][] vis;
    int n, m;
    public int orangesRotting(int[][] grid) {
         n= grid.length;
         m = grid[0].length;
        vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1)fresh++;
                else if(grid[i][j] == 2){ 
                
                    vis[i][j] =true; 
                    q.offer(new int[]{i, j});
                    }

            }
        }
        return bfs(grid);
    }
int bfs(int[][] grid){
    while(!q.isEmpty()){
        int size = q.size();
        for(int i=0;i<size;i++){
            int[] arr = q.poll();
            
            int rw = arr[0];
            int cw = arr[1];
            vis[rw][cw] = true;
            for(int[] dir : directions){
                int nr = rw + dir[0];
                int nc = cw + dir[1];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && grid[nr][nc] == 1){
grid[nr][nc] = 2;
fresh--;
vis[nr][nc] = true;
q.offer(new int[]{nr, nc});
                }
                
            }
            
        }
        if(!q.isEmpty()){
        time++;
        }
        
    }
    return fresh==0?time:-1;
}
}
