package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class AllSubWithKSum {
    public static List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> ans = new ArrayList<>();
        backTracking(n,k, ans, new ArrayList<>(),1);

        return ans;
    }

    public static void backTracking(int n, int k , List<List<Integer>> list, List<Integer> tempList,int start){
        if (tempList.size() == k || n<=0){
            if (tempList.size() == k && n ==0)
                list.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <=9 ; i++) {
            tempList.add(i);
            backTracking(n-i, k,list,tempList, i + 1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
//        [[1, 1, 5], [1, 2, 4], [1, 3, 3], [2, 2, 3]]
        System.out.println(combinationSum3(3,7));
    }
}
