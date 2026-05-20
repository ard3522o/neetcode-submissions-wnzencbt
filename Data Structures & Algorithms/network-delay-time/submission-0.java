class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[k-1] = 0;
        for(int i=0;i<n-1;i++){
            for(int[] time: times){
                int u = time[0]-1;
                int v = time[1]-1;
                int w =time[2];
                if(ans[u] != Integer.MAX_VALUE && ans[v] > ans[u] + w){
                    ans[v] = ans[u] + w;
                }
            }
        }
        int dist = Arrays.stream(ans).max().getAsInt();
        return dist == Integer.MAX_VALUE?-1:dist;
    }
}
