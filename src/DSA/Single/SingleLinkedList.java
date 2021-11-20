package DSA.Single;

public class SingleLinkedList {
    SingleListNode head;
    SingleListNode tail;
    int size;

    public SingleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addAfter(int x){
        SingleListNode tmp = new SingleListNode(x);
        if(size != 0){
            tail.next = tmp;
            tail = tmp;
        } else{
            head = tail = tmp;
        }
        size++;
    }

    public void remove(int x){
        SingleListNode tmp = head;
        while(tmp.next.val != x){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        size--;
    }

    public void addBefore(int x){
        SingleListNode tmp = new SingleListNode(x);
        if(size != 0){
            tmp.next = head;
            head = tmp;
        } else{
            head = tail = tmp;
        }
        size++;
    }

    public void removeBefore(){
        if(size == 0) System.out.println("Error, Empty List");
        head = head.next;
        size--;
    }

    public void removeAfter(){
        if(size == 0) System.out.println("Error, Empty List");
        SingleListNode tmp = head;
        while (tmp.next.next !=null){
            tmp = tmp.next;
        }
        tmp.next = null;
        size--;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        SingleListNode tmp = head;
        while (tmp != null){
            System.out.print(tmp.val + "->");
            tmp = tmp.next;
        }
    }




}
