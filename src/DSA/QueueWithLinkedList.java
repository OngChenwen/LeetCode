package DSA;

import java.util.List;

public class QueueWithLinkedList {
    ListNode head, tail;
    int size;

    public QueueWithLinkedList() {
        head = new ListNode();
        tail = new ListNode();
        size = 0;
    }

    void push(int data){
        ListNode node = new ListNode(data);//有新元素入栈，创建一个相应的结点对象，申请空间
        if(size == 0) { //如果是添加的第一个队列，将其设置为头结点
            head = node;
        }else { //否则将尾结点的下一个结点更新为新结点
            tail.next = node;
        }
        tail = node; //更新rear
        size += 1; //更新size
        System.out.println("入队元素为" + node.val);

    }

    void pop(){
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

    int peek(){
        return head.val;
    }

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        return size;
    }

}
