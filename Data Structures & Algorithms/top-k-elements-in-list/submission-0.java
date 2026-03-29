class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int[] ans = new int[k];
      Map<Integer, Integer> map = new HashMap<>();
      for(int num : nums){
        map.put(num, map.getOrDefault(num, 0)+1);
      }  
      PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
      pq.addAll(map.keySet());
      int i = 0;
      while(k>0){
        ans[i] = pq.poll();
        k--;
        i++;
      }
      return ans;
    }
}
