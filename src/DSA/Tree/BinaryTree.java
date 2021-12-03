package DSA.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode head;
    TreeNode root;

    public BinaryTree() {
        head = null;
    }

    void push(int val){
        ListNode tmp = new ListNode(val);
        if (head != null) {
            tmp.next = head;
        }
        head = tmp;
    }

    void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    TreeNode convertLinkedListToBT(ListNode head){
        if(head == null) return null;

        root = new TreeNode(head.val);

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        head = head.next;

        while (head != null){
            TreeNode tmp = q.poll();

            tmp.left = new TreeNode(head.val);
            q.offer(tmp.left);

            head = head.next;

            if(head != null) {
                tmp.right = new TreeNode(head.val);
                q.offer(tmp.right);
                head = head.next;
            }
        }

        return root;
    }


}
