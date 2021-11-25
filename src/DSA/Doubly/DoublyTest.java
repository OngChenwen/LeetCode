package DSA.Doubly;

public class DoublyTest {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addAfter(3);
        linkedList.display();

        linkedList.addAfter(2);
        linkedList.addBefore(1);
        // 1,3,2
        linkedList.display();

        linkedList.insertBefore(3);
        linkedList.removeAfter();
        linkedList.display();

        linkedList.removeBefore();
        //3
        linkedList.display();
    }
}
