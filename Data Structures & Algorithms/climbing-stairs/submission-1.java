class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(memo, 0);
    }
    int dfs(int[] memo, int i ){
        if(i >= memo.length)return i==memo.length?1:0;
        if(memo[i] != -1) return memo[i];
        memo[i] = dfs(memo, i+1) + dfs(memo, i+2);
        return memo[i];
    }
}
