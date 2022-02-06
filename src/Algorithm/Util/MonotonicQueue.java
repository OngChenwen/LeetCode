package Algorithm.Util;

import java.util.Deque;
import java.util.LinkedList;

public class MonotonicQueue {
    Deque<Integer> q = new LinkedList();

    public void push(int num){
        while (!q.isEmpty() && num > q.getLast()){
            q.pollLast();
        }
        q.addLast(num);
    }

    public int max(){
        return q.getFirst();
    }

    public void pop(int num){
        // cuz maybe the num has already been popped when some new element pushed into queue
        if(num == q.getFirst()) q.pollFirst();
    }
}
