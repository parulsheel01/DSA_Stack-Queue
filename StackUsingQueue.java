class StackUsingQueue{
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s = q.size();
        q.add(x);

        for(int i=0;i<s;i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return q.poll();
    }
    
    public int top() {
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
