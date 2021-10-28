package Test;

import java.util.ArrayList;
import java.util.List;

public class DigitsSum_EqualY {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println(helper(500,12));
        System.out.println(ans);

    }

    static int helper(int number, int target){
        int[] dp = new int[number + 1];

        dp[0] = 0;

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int start = i;

            while(start>0){

                int tmp = start % 10;
                sum += tmp;
                start = start/10;
            }

            dp[i] = sum == target ? dp[i-1] + 1: dp[i - 1];

            if (sum == target){
                ans.add(i);
            }

        }

        return dp[number];
    }
}
