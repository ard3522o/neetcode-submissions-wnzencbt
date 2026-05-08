class Solution {
    public List<String> letterCombinations(String digits) {
      List<String> res = new ArrayList<>();
      res.add("");
       if(digits.isEmpty()) return new ArrayList<>();
        String[] digToLetter = {"", "", "abc", "def", "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
        };
        for(char digit: digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String ch: res){
                for(char cb: digToLetter[digit - '0'].toCharArray()){
                    temp.add(ch+cb);
                }
            }
            res = temp;
        }
        return res;
    }
}
