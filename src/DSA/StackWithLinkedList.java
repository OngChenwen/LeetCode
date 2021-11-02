package DSA;



public class StackWithLinkedList {
    private ListNode head;
    public StackWithLinkedList(){
        head = new ListNode();
    }

    void push(int x){
        ListNode tmp = new ListNode(x);
        tmp.next = head;
        head = tmp;
    }

    int pop(){
        int ans = head.val;
        head = head.next;
        return ans;
    }

    int peek(){
        if(!isEmpty()){
            return head.val;
        } else{
            System.out.println("Error is Empty");
            return -1;
        }
    }

    boolean isEmpty(){
        return head == null;
    }

    void display(){
        if(head == null) return;
        ListNode tmp = head;
        while (tmp != null){
            System.out.print(tmp.val);
            tmp = tmp.next;
        }

        System.out.println();
    }

}
