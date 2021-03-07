package Algorithem;

import java.util.ArrayList;
import java.util.List;

public class AllSub {
    List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        return ans;
    }

    void backTracking(int[] nums, List<List<Integer>> res, List<Integer> subs){
        if (subs.size() == nums.length) {
            res.add(new ArrayList<>(subs));
            return;}

        for (int i = 0; i < nums.length ; i++) {
            if(subs.contains(nums[i])) continue;
            subs.add(nums[i]);
            backTracking(nums,res,subs);
            subs.remove(subs.size()-1);

        }

    }
}

