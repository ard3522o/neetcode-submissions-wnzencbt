class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<stones.length;i++){
        pq.offer(stones[i]);
      }
      while(!pq.isEmpty()){
        int n1 = pq.poll();
       if(pq.isEmpty()) return n1; 
       
       int n2 = pq.poll();

        int n3 = Math.abs(n1-n2);
        if(n3 != 0) pq.offer(n3);
      }
      return 0;

    }
}
