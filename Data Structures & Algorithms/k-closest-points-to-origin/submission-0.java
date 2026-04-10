class Solution {
    public int[][] kClosest(int[][] points, int k) {
       int[][] ans = new int[k][2];
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->Integer.compare(sq(b[0], b[1]), sq(a[0], a[1])));
       for(int i=0;i<points.length;i++){
        pq.offer(points[i]);

        if(pq.size() > k){
            pq.poll();
        }
       } 
       int i = 0;
       while(k>0){
        ans[k-1] = pq.poll();
        k--;
       }
return ans;
    }
    public int sq(int a, int b){
        return (int)((int)a*a + (int)b*b);
    }
}
