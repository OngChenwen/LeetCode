package DSA.Doubly;

public class DoublyStack {
    int size;
    DoublyListNode head;

    public DoublyStack() {
        size = 0;
        head = new DoublyListNode();
    }

    public void push(int x){
        DoublyListNode tmp = new DoublyListNode(x);
        head.next = tmp;
        tmp.prev = head;
        head = tmp;
        size++;
    }

    public int pop(){
        int ans = head.val;
        head = head.prev;
        head.next = null;
        size--;
        return ans;
    }

    public int peek(){
        return head.val;
    }

    public boolean isEmpty(){
        return size <= 0;
    }
}
