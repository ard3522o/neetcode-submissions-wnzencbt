class Solution {
    public int countComponents(int n, int[][] edges) {
List<List<Integer>> adj = new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());

}
for(int[] edge : edges){
    int u = edge[0];
    int v = edge[1];
    adj.get(u).add(v);
    adj.get(v).add(u);
} 
int count = 0;
boolean[] vis = new boolean[n];
for(int i=0;i<n;i++){
    if(!vis[i]){
        dfs(i, vis, adj);
        count++;
    }
}
return count;
    }
    public void dfs(int node, boolean[] vis, List<List<Integer>> adj){

        vis[node] = true;
        for(int nb : adj.get(node)){
            if(!vis[nb]){
                dfs(nb, vis, adj);
            }
        }
    }

}
