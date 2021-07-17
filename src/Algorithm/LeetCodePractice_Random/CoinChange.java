package Algorithm.LeetCodePractice_Random;

public class CoinChange {
    public static int possible(int[] A, int M){
        // 0..M : [M+1]
        int[] f = new int[M+1];
        int length = A.length;

        f[0] = 0;

        for (int i = 1; i <= M ; i++) {
            f[i] = Integer.MAX_VALUE;

            for (int j = 0; j < length; j++) {
                if(i >= A[j] && f[i- A[j]] != Integer.MAX_VALUE){
                    f[i] = Math.min(f[i-A[j]]+1, f[i]);
                }
            }
        }

        if(f[M] == Integer.MAX_VALUE){
            f[M] = -1;
        }

        return f[M];
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,7,8};
        int result = possible(A,10);

        System.out.println(result);
    }

}
