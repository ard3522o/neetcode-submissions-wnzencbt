class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
         for(String word: strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String wr = new String(ch);
            if(!map.containsKey(wr)){
                map.put(wr, new ArrayList<>());
            }
            map.get(wr).add(word);
         }
         return new ArrayList<>(map.values());
    }
}
