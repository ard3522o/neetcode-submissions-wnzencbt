class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      int len = 0;
      int ans = 0;
      int i=0;
      while(i < s.length()){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            i++;
        }else{
len = set.size();
set.clear();
ans = Math.max(ans, len);
        }
      }
return ans;
    }
}
