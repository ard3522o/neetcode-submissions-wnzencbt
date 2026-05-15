class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       int[] indegree = new int[numCourses];
     List<List<Integer>> adj = new ArrayList<>();
     for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
     }   
     for(int[] edge: prerequisites){
        int u = edge[0];
        int v = edge[1];
        adj.get(u).add(v);
        indegree[v]++;
     }
     Queue<Integer> q = new LinkedList<>();
     for(int i=0;i<numCourses;i++){
        if(indegree[i] == 0){
            q.offer(i);
        }
     }
     int count = 0;
     int[] ans = new int[numCourses];
     while(!q.isEmpty()){
        int curr = q.poll();
        ans[numCourses-1-count] = curr;
        count++;
        for(int nb: adj.get(curr)){
            indegree[nb]--;
            if(indegree[nb] == 0)q.offer(nb);
        }
     }
     if(count == numCourses) return ans;
     return new int[]{};  
    }
}
