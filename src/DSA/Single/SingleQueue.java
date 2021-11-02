package DSA.Single;

public class SingleQueue {
    SingleListNode head, tail;
    int size;

    public SingleQueue() {
        head = new SingleListNode();
        tail = new SingleListNode();
        size = 0;
    }

    public void push(int data){
        SingleListNode node = new SingleListNode(data);//有新元素入栈，创建一个相应的结点对象，申请空间
        if(size == 0) { //如果是添加的第一个队列，将其设置为头结点
            head = node;
        }else { //否则将尾结点的下一个结点更新为新结点
            tail.next = node;
        }
        tail = node; //更新rear
        size += 1; //更新size
        System.out.println("入队元素为" + node.val);

    }

    public void pop(){
        if(size == 0) {
            System.out.println("这是一个空队列");
            tail = null; //更新tail
        }else {
            int data = head.val;
            head = head.next; //更新头结点
            System.out.println("出队元素为" + data);
            size -= 1; //更新size
        }
    }

    public int peek(){
        return head.val;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

}
