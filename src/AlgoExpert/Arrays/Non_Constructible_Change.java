package AlgoExpert.Arrays;

import java.util.Arrays;

public class Non_Constructible_Change {
    // current sum + 1 should be small than the next coin
    public static int nonConstructibleChange(int[] coins){
        Arrays.sort(coins);
        int change = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] > change + 1) return change + 1;
            change += coins[i];
        }

        return change + 1;
    }
    // Answer = 20
    public static void main(String[] args) {
        int[] coins = new int[]{5,7,1,1,2,3,22};
        System.out.println(nonConstructibleChange(coins));
    }
}
