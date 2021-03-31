package Algorithem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AllSubWithKSum {
    public static List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTracking(n,k, ans, new ArrayList<>(),1);

        return ans;
    }

    public static void backTracking(int n, int k , List<List<Integer>> list, List<Integer> tempList, int start){
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
        System.out.println(combinationSum3(3,7));
    }
}
