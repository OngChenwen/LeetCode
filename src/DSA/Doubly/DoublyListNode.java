package DSA.Doubly;

public class DoublyListNode {
    int val;
    DoublyListNode next;
    DoublyListNode prev;

    public DoublyListNode() {}
    public DoublyListNode(int val) {this.val = val;}
    public DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
