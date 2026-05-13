class Solution {
    int n;
    int m;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int orangesRotting(int[][] grid) {
        int time =0;
        
     Queue<int []> q = new LinkedList<>();
        n = grid.length;
        m = grid[0].length;
        int fresh = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                    vis[i][j] = true;
                }else if(grid[i][j] == 1){
                    fresh += 1;
                }
            }
        }
        while(!q.isEmpty() && fresh != 0){
int size = q.size();
for(int i=0;i<size;i++){
    int[] arr = q.poll();
    int rw = arr[0];
    int cw = arr[1];
    for(int [] dir : directions){
        int nr = dir[0]+ rw;
        int nc = dir[1] + cw;
        if(nr>=0 && nr < n && nc >=0 && nc < m && !vis[nr][nc] && grid[nr][nc] == 1){
            fresh--;
            q.offer(new int[]{nr, nc});
            vis[nr][nc] = true;
            grid[nr][nc] = 2;
        }
    }
    
}
time++;
        }
        return fresh==0?time:-1;
    }
}
