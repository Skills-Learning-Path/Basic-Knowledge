class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> mins=new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        stack.push(x);
        if(mins.isEmpty()||x<=mins.peek()){
            mins.push(x);
        }
        else{
            mins.push(mins.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        mins.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
