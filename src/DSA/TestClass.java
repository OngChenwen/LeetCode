package DSA;




public class TestClass {
    public static void main(String[] args) {
//        DoublyStack stack = new DoublyStack();
//        SingleQueue myQueue = new SingleQueue();
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

        Queue q = new Queue();
        q.push(1);
        System.out.println(q.isEmpty());
        q.push(3);
        q.display();
        q.pop();
        q.push(4);
        q.push(7);
        q.display();

    }
}
