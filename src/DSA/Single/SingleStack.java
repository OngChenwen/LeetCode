package DSA.Single;



public class SingleStack {
    private SingleListNode head;
    public SingleStack(){
        head = new SingleListNode();
    }

    public void push(int x){
        SingleListNode tmp = new SingleListNode(x);
        tmp.next = head;
        head = tmp;
    }

    public int pop(){
        int ans = head.val;
        head = head.next;
        return ans;
    }

    public int peek(){
        if(!isEmpty()){
            return head.val;
        } else{
            System.out.println("Error is Empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display(){
        if(head == null) return;
        SingleListNode tmp = head;
        while (tmp != null){
            System.out.print(tmp.val);
            tmp = tmp.next;
        }

        System.out.println();
    }

}
