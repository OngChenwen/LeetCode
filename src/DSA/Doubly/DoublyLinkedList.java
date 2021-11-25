package DSA.Doubly;

public class DoublyLinkedList {
    DoublyListNode head,tail;
    int size;

    public DoublyLinkedList() {
        head = new DoublyListNode();
        tail = new DoublyListNode();
        size = 0;
    }

    public void addAfter(int x){
        DoublyListNode tmp = new DoublyListNode(x);
        if(size != 0){
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
        } else{
            head = tail = tmp;
        }
        size++;
    }

    public void insertBefore(int x){
        if(!contains(x)) return;
        DoublyListNode newNode  = new DoublyListNode(x);
        DoublyListNode tmp = head;
        while(tmp != null){
            if(tmp.val == x){
                break;
            }
            tmp = tmp.next;
        }

        if(tmp != null && tmp.prev != null){
            DoublyListNode pre = tmp.prev;
            newNode.next = tmp;
            tmp.prev = newNode;
            pre.next = newNode;
            newNode.prev = pre;
        } else {
            addBefore(x);
        }
        size++;
    }

    public void insertAfter(int x){
        if(!contains(x)) return;
        DoublyListNode newNode  = new DoublyListNode(x);
        DoublyListNode tmp = head;
        while(tmp != null){
            if(tmp.val == x){
                break;
            }
            tmp = tmp.next;
        }

        if(tmp != null && tmp.next != null){
            newNode.next = tmp.next;
            tmp.next.prev = newNode;
            tmp.next = newNode;
            newNode.prev = tmp;
        } else {
            addAfter(x);
        }
        size++;
    }

    public void addBefore(int x){
        DoublyListNode tmp = new DoublyListNode(x);
        if(size != 0){
            tmp.next = head;
            head.prev = tmp;
            head = tmp;
        } else{
            head = tail = tmp;
        }
        size++;
    }

    public void removeAfter(){
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void removeBefore(){
        head = head.next;
        size--;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(int x){
        if (isEmpty()) return false;
        DoublyListNode tmp = head;
        while(tmp != null){
            if (tmp.val == x){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public void display(){
        DoublyListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + "->");
            tmp = tmp.next;
        }
        System.out.print("X");
        System.out.println();
    }

}
