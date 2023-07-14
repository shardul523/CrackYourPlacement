import java.util.ArrayDeque;
import java.util.Deque;

class TwoQueuesInStack {
    Deque<Integer> q1;
    Deque<Integer> q2;

    public TwoQueuesInStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.addLast(x);
    }
    
    public int pop() {
        while (q1.size() > 1) 
            q2.addLast(q1.pollFirst());
        
        int x = q1.pollFirst();

        while (!q2.isEmpty())
            q1.addLast(q2.pollFirst());

        return x;
    }
    
    public int top() {
        int x = this.pop();
        this.push(x);

        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}