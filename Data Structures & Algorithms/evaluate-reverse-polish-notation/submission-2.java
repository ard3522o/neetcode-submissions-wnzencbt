class Solution {
    public int evalRPN(String[] tokens) {
    int sum  = 0;
    Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            if(token.equals("+") && !st.isEmpty()){
int a = st.pop();
int b = st.pop();
 sum = a + b;
st.push(sum);
            }else if(token.equals("-")){
                int a = st.pop();
int b = st.pop();
 sum = b - a;
st.push(sum);
            }else if(token.equals("*")){
                int a = st.pop();
int b = st.pop();
 sum = a * b;
st.push(sum);
            }else if(token.equals("/")){
                int a = st.pop();
int b = st.pop();
if(b != 0){
 sum = b / a;
}else{
    sum = 0;
}
st.push(sum);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
