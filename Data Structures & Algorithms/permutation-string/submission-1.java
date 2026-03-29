class Solution {
    public boolean checkInclusion(String s1, String s2) {

     for(int i=0;i<=s2.length()-s1.length();i++){
       int j = i+s1.length();
       String str = s2.substring(i, j);
      if(ispresent(str, s1)){
        return true;
      }

     }
return false;
    }
    public boolean ispresent(String s1, String s2){
Map<Character, Integer> map = new HashMap<>();
for(int i=0;i<s1.length();i++){
    map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);

}
for(int i=0;i<s2.length();i++){
    if(map.getOrDefault(s2.charAt(i), 0) == 0) return false;
map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);

}
return true;

    }
}
