package DSA;

public class Queue {
    private int font, tail;
    private int[] arr;
    private int size = 0;

    public Queue() {
        font = 0;
        tail = 0;
        arr = new int[50];
    }

    public void push(int x){
        if(size  == arr.length -1) System.out.println("Full");

        arr[tail] = x;

        tail = (tail + 1) % arr.length;

        size++;
    }

    public int pop(){
        int ans = arr[font];
        font = (font + 1) % arr.length;
        return ans;
    }

    public int size(){
        return ((arr.length - font) + tail) % arr.length;
    }

    public boolean isEmpty(){
        return font == tail;
    }

    void display(){
        for (int i = font % arr.length; i < tail % arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
