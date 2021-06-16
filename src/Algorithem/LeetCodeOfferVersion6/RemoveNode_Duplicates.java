package Algorithem.LeetCodeOfferVersion6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveNode_Duplicates {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x; }
    }
    public ListNode removeDuplicateNodes(ListNode head){
        Set<Integer> collection = new HashSet<>();
        if (head == null || head.next == null) return head;

        ListNode cur = head.next;
        ListNode pre = head;

        collection.add(head.val);

        while (cur!= null){
            if (collection.contains(cur.val)){
                pre.next = cur.next;
                cur = cur.next;

            } else {
                collection.add(cur.val);
                cur = cur.next;
                pre = pre.next;
            }
        }

        return head;
    }
}
