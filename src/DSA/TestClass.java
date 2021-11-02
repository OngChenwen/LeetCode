package DSA;

import java.util.Queue;

public class TestClass {
    public static void main(String[] args) {
        QueueWithLinkedList myQueue = new QueueWithLinkedList();
//        StackWithLinkedList stack = new StackWithLinkedList();
//        stack.push(11);
//        stack.push(22);
//        stack.push(33);
//        stack.push(44);
//
//        stack.display();
//
//        System.out.println("First check: " + stack.isEmpty());
//
//        stack.pop();
//        System.out.println("Current top is " + stack.peek());
//        stack.pop();
//
//        stack.display();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.pop();
        myQueue.pop();

        System.out.println(myQueue.peek());
    }
}
