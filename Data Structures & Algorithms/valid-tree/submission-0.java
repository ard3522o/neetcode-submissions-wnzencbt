class Solution {
    public boolean validTree(int n, int[][] edges) {
if(edges.length > n-1) return false;
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
Queue<int[]> q = new LinkedList<>();
q.offer(new int[]{0, -1});
Set<Integer> set = new HashSet<>();
set.add(0);
while(!q.isEmpty()){
    int[] curr = q.poll();
    int node  = curr[0];
    int parent = curr[1];
    for(int nb : adj.get(node)){
        if(nb == parent) continue;
        if(set.contains(nb)){
            return false;
        }
        set.add(nb);
        q.offer(new int[]{nb, node});
    } 
}
return set.size() == n;

    }
}
