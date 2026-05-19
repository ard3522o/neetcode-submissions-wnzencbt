class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> ans = new ArrayList<>();
    ans.add(intervals[0]);
    for(int[] interval : intervals){
        int st = interval[0];
        int end = interval[1];
        int last = ans.get(ans.size()-1)[1];
        if(last >= st){
             ans.get(ans.size()-1)[1] = Math.max(last, end);
        }else{
            ans.add(new int[]{st, end});
        }
    }
    return ans.toArray(new int[ans.size()][]);
    }
}
