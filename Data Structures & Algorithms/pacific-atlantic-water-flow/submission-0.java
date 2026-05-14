class Solution {
    int n;
    int m;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights.length;
        m = heights[0].length;
        Queue<int []> pac = new LinkedList<>();
        Queue<int []> atl = new LinkedList<>();
        boolean[][] paco = new  boolean[n][m];
        boolean[][] atlo = new boolean[n][m];
for(int c=0;c<m;c++){
    pac.add(new int[]{0, c});
    atl.add(new int[]{n-1, c});
}
for(int r=0;r<n;r++){
    pac.add(new int[]{r, 0});
    atl.add(new int[]{r, m-1});
}

        bfs(heights,  pac, paco);
        bfs(heights, atl, atlo);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(paco[i][j] && atlo[i][j]){
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
    public void bfs(int[][] heights, Queue<int[]> q, boolean[][] arr){
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            arr[r][c] = true;
            for(int[] d: directions){ 
                int nr = d[0]+ r;
                int nc = d[1]  + c;
                if(nr >= 0 && nr < n && nc >= 0 && nc <m && !arr[nr][nc] && heights[nr][nc] >= heights[r][c]){
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
}
