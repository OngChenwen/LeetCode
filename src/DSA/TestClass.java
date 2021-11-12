package DSA;

import DSA.Heap.MaxHeap;
import DSA.Heap.MinHeap;
import DSA.Heap.PQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
//
//        Queue q = new Queue();
//        q.push(1);
//        System.out.println(q.isEmpty());
//        q.push(3);
//        q.display();
//        q.pop();
//        q.push(4);
//        q.push(7);
//        q.display();
//        MinHeap minHeap = new MinHeap(5);
//        minHeap.insert(4);
//        minHeap.insert(21);
//        minHeap.insert(22);
//        minHeap.insert(59);
//        minHeap.insert(31);
//        // 4 21 22 31 59
//        for (int i = 0; i < 1; i++) {
//            minHeap.remove();
//        }
//        System.out.println(minHeap.peek());

        PQ pq = new PQ();
        List<Integer> tmp = new ArrayList<>(Arrays.asList(95,22,53,64,66,31,24,86,221));

        for (int n: tmp){
            pq.add(n);
        }

        for (int i = 0; i < 1 ; i++) {
            pq.exactMax();
        }
        Collections.sort(tmp);
        System.out.println("tmp = " + tmp);
        System.out.println(pq.peek());


    }

}
