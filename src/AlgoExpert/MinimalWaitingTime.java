package AlgoExpert;

import java.util.Arrays;

public class MinimalWaitingTime {
    //前缀和
    public static int minimumWaitingTime(int[] queries) {
        int[] preSum = new int[queries.length +1 ];
        preSum[0] = 0;
        Arrays.sort(queries);
        for (int i = 0; i < queries.length - 1; i++) {
            preSum[i + 1] = preSum[i] +  queries[i];
        }

        int sum = 0;
        for (int i = 0; i < preSum.length; i++) {
            sum += preSum[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,2,6};

        System.out.println(minimumWaitingTime(array));
    }
}
