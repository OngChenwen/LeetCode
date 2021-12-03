package DSA.Tree;

public class BinarySearchTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int val){
       if(root == null) return new TreeNode(val);
       if(val < root.val){
           root.left = insert(root.left,val);
       } else if(val > root.val){
           root.right = insert(root.right,val);
       }
       return root;
    }

    public TreeNode delete(TreeNode root, int val){
        if(root == null) return null;

        if(val < root.val ){
            root.left = delete(root.left,val);
        } else if(val > root.val){
            root.right = delete(root.right,val);
        } else {
            if (root.left == null && root.right == null) return null;
            else if(root.left != null && root.right == null) return root.left;
            else if(root.left == null) return root.right;
            else {
                TreeNode leftMax = root.left;
                while(leftMax.right != null){
                    leftMax = leftMax.right;
                }
                root.val = leftMax.val;
                root.left = delete(root.left,leftMax.val);
            }
        }

        return root;
    }

    public void add(int val){
        root = insert(root,val);
    }

    public boolean search(TreeNode root,int val){
        if(root == null) return false;
        if (root.val == val) return true;

        return val < root.val ? search(root.left,val) : search(root.right,val);
    }

    public boolean contains(TreeNode root , int val){
        return search(root,val);
    }

    public void display(TreeNode root){
        if(root == null) {
//            System.out.println("empty");
            return;
        }

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
}
