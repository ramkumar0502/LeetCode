class MyStack {
     Queue<Integer> obj;
     int size=0;

    public MyStack() {
       obj=new LinkedList<>();
    }
    
    public void push(int x) {
         int data=x;
        if(size==0)
        {
          obj.offer(data);
            size++;
            return;
        }
        obj.offer(data);
        for(int i=0;i<size;i++)
        {
            obj.offer(obj.poll());
        }
        size++;

        
    }
    
    public int pop() {
        size--;
        return obj.poll();
        
    }
    
    public int top() {
        return obj.peek();  
    }
    
    public boolean empty() {
        if(size==0)
        {
            return true;
        }
        return false;
        
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