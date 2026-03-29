class MinStack {
Stack<Integer> st1 ;
Stack<Integer> st2 ;

    public MinStack() {
       st1 = new Stack<>();
       st2 = new Stack<>(); 
    }
    
    public void push(int val) {
       
        st1.push(val);
        if(st2.isEmpty() || val <= st2.peek()){
            st2.push(val);
        }
        
        
    }
    
    public void pop() {
        if(!st1.isEmpty()){
          int val =   st1.pop();
          if(val == st2.peek()){
            st2.pop();
          }
        }
    }
    
    public int top() {
        int tp = st1.peek();
        return tp;
    }
    
    public int getMin() {
     int min = st2.peek();

     return min;
    }
}
