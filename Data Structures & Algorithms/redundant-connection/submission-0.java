class Solution {
    private boolean[] visit ;
    List<List<Integer>> adj;
    Set<Integer> cycle;
    int start; 
    public int[] findRedundantConnection(int[][] edges) {
       int n = edges.length;
       adj = new ArrayList<>();
       for(int i=0;i<=n;i++){
        adj.add(new ArrayList<>());
       }
       for(int[] edge : edges){
        int u = edge[0];
        int v = edge[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
       }
       visit = new boolean[n+1];
       cycle = new HashSet<>();
       start = -1;
       dfs(1, -1);
       for(int i=edges.length-1;i>=0;i--){
        int u = edges[i][0];
        int v = edges[i][1];
        if(cycle.contains(u) && cycle.contains(v)){
            return new int[]{u, v};
        }
       }
       return new int[0];
    }

private boolean dfs(int node, int par){
    if(visit[node]){
        start = node;
        return true;
    }
    visit[node] = true;
    for(int nb : adj.get(node)){
        if(nb == par) continue;
        if(dfs(nb, node)){
            if(start != -1)cycle.add(node);
            if(node == start){
                start = -1;
            }
            return true;
        }
    }
    return false;
}

}
