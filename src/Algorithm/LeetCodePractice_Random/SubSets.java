package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void subsets(int[] nums){
        backTracking(nums,0,nums.length,new ArrayList<>());
    }

    public static void backTracking(int[] nums,int index, int n, List<Integer> path){
        if (path.size()> n) return;
        ans.add(new ArrayList<>(path));
        for (int i = index; i < n ; i++) {
            path.add(nums[i]);
            backTracking(nums,i+1,n,path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] examples ={1,2,3};
        subsets(examples);

        System.out.println(ans);
    }
}
