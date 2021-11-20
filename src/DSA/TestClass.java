package DSA;

import DSA.Heap.MaxHeap;
import DSA.Heap.MinHeap;
import DSA.Heap.PQ;
import DSA.Single.SingleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.addAfter(2);
        linkedList.addAfter(3);
        linkedList.addAfter(4);
        linkedList.display();

        System.out.println();
        // remove specified node
        linkedList.remove(3);
        linkedList.display();

        System.out.println();
        // addBefore
        linkedList.addBefore(1);
        linkedList.display();

        System.out.println();
        // removeBefore
        linkedList.removeBefore();
        linkedList.display();

        System.out.println();
        // removeAfter
        linkedList.removeAfter();
        linkedList.display();

        System.out.println();
        // check Empty
        System.out.println(linkedList.isEmpty());

        // check contains
        System.out.println(linkedList.contains(1));

        // check size
        System.out.println(linkedList.size());

    }

}
