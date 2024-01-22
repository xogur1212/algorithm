class MinStack {

     Stack<Integer> intergerStack ;
     Stack<Integer> minStack;
 
  
    public MinStack() {
       intergerStack = new Stack<>();
       minStack = new Stack<>();
 
    }
    
    public void push(int val) {
        intergerStack.push(val);

        if(minStack.isEmpty())
            minStack.push(val);
        else if (minStack.peek() >= val)
            minStack.push(val);

      
    
    }
    
    public void pop() {
    
        int val = intergerStack.pop();
 
        if (minStack.peek() == val)
            minStack.pop();

      
        
        
    }
    
    public int top() {
        return intergerStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */