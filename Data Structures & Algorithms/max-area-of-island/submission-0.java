class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int total =0;
        int area = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                  
               area =  dfs(grid, i, j);
total = Math.max(total, area);
                }
            }
           
        }
         
        return total;
    }
    public int dfs(int[][] grid, int r, int c){
         if(r <0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int ans = 1;
        for(int[] dir: dirs){
           ans += dfs(grid, r+dir[0], c+dir[1]);
        }
        return ans;
    }
}
