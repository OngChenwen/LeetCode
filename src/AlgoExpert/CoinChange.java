package AlgoExpert;

public class CoinChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] dp = new int[denoms.length + 1];
        dp[0] = 1;
        
        for (int denom: denoms) {
            for (int i = 1; i < n + 1; i++) {
                dp[i] += dp[n - denom];
            }
        }
        return dp[denoms.length];
    }
}
