package Amazon.OA;

public class LeftSumGreater {
    public static void main(String[] args) {
        int[] arr = new int[]{10,4,-8,7};
        System.out.println(help(arr));
    }

    static int help(int[] num){
        int ans = 0;
        int n = num.length;
        int[] pre = new int[n];
        pre[0] = num[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + num[1];
        }

        for(int i = 0; i < n - 1; i++){
            int left = pre[i];
            int right = pre[n - 1] - left;
            if (left > right) ans++;
        }

        return ans;
    }
}
