package Algorithem.LeetCodeOfferVersion6;


import java.util.List;
import java.util.Stack;

public class CheckPalindrome {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x; }
    }

    public boolean isPalindrome(ListNode head){
        Stack<Integer> collections = new Stack<>();
        ListNode fast = head;

        while (fast!=null && fast.next != null){
            collections.push(head.val);
            head = head.next;
            fast = fast.next.next;
        }

        if (fast != null){
            head = head.next;
        }

        while (head != null){
            if (collections.pop() != head.val) return false;
            head = head.next;
        }

        return true;
    }
}
