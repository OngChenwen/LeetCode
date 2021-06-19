package Algorithem.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static int[] singleNumbers(int[] nums){
        List<Integer> result = new ArrayList<>();
        int[] stastic = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            stastic[nums[i]]++;
        }

        for (int i = 0; i < stastic.length; i++) {
            if(stastic[i] == 1) result.add(i);
        }
        int[] results = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            results[i] = result.get(i);
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumbers(new int[]{4, 1, 4, 6})));
    }
}
