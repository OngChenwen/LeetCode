package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class BranchSum_Easy {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        calculate(root,0,result);

        return result;
    }

    public static void calculate(BinaryTree root, int sum, List<Integer> sums){
        if(root == null) return;
        int Sum  = root.value + sum;
        if(root.left == null && root.right == null){
            sums.add(sum + Sum);
            return;
        }

        calculate(root.left, Sum, sums);
        calculate(root.right, Sum, sums);
    }
}
