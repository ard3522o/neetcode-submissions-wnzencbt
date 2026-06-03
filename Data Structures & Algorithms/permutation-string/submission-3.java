class Solution {
    public boolean checkInclusion(String s1, String s2) {
     Map<Character, Integer> m1 = new HashMap<>();
     Map<Character, Integer> m2 = new HashMap<>();
     for(int i=0;i<s1.length();i++){
        m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0)+1);
     } 
     int l =0;
       for(int r=0;r<s2.length();r++){
m2.put(s2.charAt(r), m2.getOrDefault(s2.charAt(r), 0)+1);

if(r-l + 1 > s1.length()){
   char ch = s2.charAt(l);
   m2.put(ch, m2.get(ch)-1);
   if(m2.get(ch) == 0) m2.remove(ch); 
   l++;
}
if(r-l+1 == s1.length()){
    if(m2.equals(m1))return true;
}
       }
       return false;
    }
}
