package DSA.Doubly;

class QNode
{
    public int data;
    public QNode next;
    public QNode prev;
    public QNode(int data, QNode prev)
    {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
}
public class MyQueue
{
    public QNode front;
    public QNode rear;
    public int size;
    public MyQueue()
    {
        this.front = null;
        this.rear = null;
    }
    // Add a node into queue
    public void enqueue(int data)
    {
        //Create a dynamic node
        QNode node = new QNode(data, this.rear);
        if (this.front == null)
        {
            // When adding a first node of queue
            this.front = node;
            this.size = 1;
        }
        else
        {
            this.rear.next = node;
            this.size = this.size + 1;
        }
        this.rear = node;
    }
    public boolean isEmpty()
    {
        if (this.size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Get a front element of queue
    public int peek()
    {
        if (this.isEmpty() == true)
        {
            System.out.print("\n Empty Queue \n");
            // When stack is empty
            return -1;
        }
        else
        {
            return this.front.data;
        }
    }
    public int isSize()
    {
        return this.size;
    }
    // Remove a front node of a queue
    public int dequeue()
    {
        if (this.isEmpty() == true)
        {
            // When queue is empty
            return -1;
        }
        else
        {
            int data = this.peek();
            QNode temp = this.front;
            if (this.front == this.rear)
            {
                // When queue contains only one node
                this.rear = null;
                this.front = null;
            }
            else
            {
                this.front = this.front.next;
                this.front.prev = null;
            }
            // Change queue size
            this.size--;
            return data;
        }
    }
    // Print elements of queue
    public void printQdata()
    {
        QNode node = this.front;
        System.out.print("\n Queue Element \n");
        while (node != null)
        {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        MyQueue q = new MyQueue();
        // Add queue element
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQdata();
        System.out.print(" Size : " + q.isSize());
        // Remove queue element
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        q.printQdata();
        System.out.print(" Size : " + q.isSize());
    }
}
