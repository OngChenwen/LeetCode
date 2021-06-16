package Algorithem.LeetCodeOfferVersion6;

import java.util.List;

public class IntersectionNode {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        while(la != lb){
            //到达链表末尾时，重新走另一条链表的路
            la = la == null ? headB : la.next;
            lb = lb == null ? headA : lb.next;
        }
        return la;
    }

    //Solution - 2
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        // 首先把空链表的情况排除掉
//        if (headA == null || headB == null) return null;
//        // 对链表大小进行计数,同时定位最后一个链表节点
//        int size1 = 1, size2 = 1;
//        ListNode tail1 = headA, tail2 = headB;
//        while (tail1.next != null) {
//            tail1 = tail1.next;
//            size1++;
//        }
//        while (tail2.next != null) {
//            tail2 = tail2.next;
//            size2++;
//        }
//        // 如果最后一个节点不是同一个,那么说明根本不会相交,所以直接返回空节点
//        if (tail2 != tail1) return null;
//        // 计算两个链表长度差值
//        int diff = Math.abs(size1 - size2);
//        // 如果链表 A 比 B 长,那么先把 A 的指针往后偏移 diff 个, 否则就便宜 B 的指针
//        if (size1 > size2) while (--diff >= 0) headA = headA.next;
//        else if (size1 < size2) while (--diff >= 0) headB = headB.next;
//        // 找到相同的位置,并返回
//        while (headA != headB) {
//            headA = headA.next;
//            headB = headB.next;
//        }
//        return headA;
//    }


}
