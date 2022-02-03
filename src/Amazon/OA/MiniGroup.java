package Amazon.OA;

import java.util.Arrays;

public class MiniGroup {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        System.out.println(helper(arr,1));
    }

    static int helper(int[] num, int k){
        Arrays.sort(num);
        int res = 0, first = num[0];
        for(int i = 1; i < num.length;i++){
            if (num[i] <= first + k) continue;
            res++;
            first = num[i];
            System.out.println("res in for " + i  + " : " + res);
        }

        if (num[num.length - 1] <= first + k) res++;

        return res;
    }
}
