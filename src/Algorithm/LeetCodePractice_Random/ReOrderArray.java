package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> arrayX = new ArrayList<>();
        List<Integer> arrayY = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            arrayX.add(nums[i]);
        }

        for (int i = n; i < nums.length; i++) {
            arrayY.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            resultList.add(arrayX.get(i));
            resultList.add(arrayY.get(i));
        }

        int[] results = new int[2*n];

        for(int i = 0; i < resultList.size(); i++) results[i] = resultList.get(i);

        return results;
    }

    // odd and even
//    int[] ans = new int[2 * n];
//    int j = 0;
//    int k = 0;
//        for (int i = 0;i < 2 * n;i++){
//        if(i % 2 == 0){//偶数
//            ans[i] = nums[j];
//            j++;
//        }else {//奇数
//            ans[i] = nums[n + k];
//            k++;
//        }
//    }
//        return ans;
}


