package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DigitsSum_EqualY {

    public static void main(String[] args) {

        System.out.println(helper(20,5));
    }

    static int helper(int number, int target){
        int[] dp = new int[number + 1];

        dp[0] = 0;

        for (int i = 1; i <= number; i++) {
            int counter = 0, sum = 0;
            int start = i;

            while(start>0){

                int tmp = start % 10;
                sum += tmp;
                start = start/10;
            }

            if (sum == target){
                dp[i] = dp[i - 1] + 1;
            } else
            {
                dp[i] = dp[i - 1];
            }

        }
        System.out.println(Arrays.toString(dp));
        return dp[number];
    }
}
