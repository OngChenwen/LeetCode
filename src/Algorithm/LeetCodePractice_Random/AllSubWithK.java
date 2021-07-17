package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class AllSubWithK {
    static public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        backTracking( n, k, ans, new ArrayList<>(),1, 0);
        return ans;
    }

    public static void backTracking(int n, int k,List<List<Integer>> list, List<Integer> tempList, int start, int depth){
        if(depth ==k) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        // 剪枝 ： n - i + 1 -> 当前还剩的可选元素 （大于） k - depth -> 目前还要选择元素个数
        for (int i = start; i <=n; i++) {
            tempList.add(i);
            backTracking(n,k,list,tempList, i +1, depth +1); // start = i +1 not start = start + 1
            tempList.remove(tempList.size() -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }

}
