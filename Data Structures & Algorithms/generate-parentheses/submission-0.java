class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> res = new ArrayList<>();
     dfs("", res, n);
     return res;   
    }
    void dfs(String s, List<String> res, int n){
        if(n*2 == s.length()){
            if(isValid(s)) res.add(s);
            return;
        }
        dfs(s + '(', res, n);
        dfs(s + ')', res, n);
    }
    boolean isValid(String s){
        int  balance = 0;
        for(char  ch : s.toCharArray()){
            balance += ch == '('?1:-1;
            if(balance < 0) return false;

        }
        return balance == 0;
    }
}
