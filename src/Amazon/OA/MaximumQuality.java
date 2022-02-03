package Amazon.OA;

import java.util.Arrays;

public class MaximumQuality {
    public static void main(String[] args) {
        int[] p = new int[]{5,2,2,1,5,3};
        System.out.println(helper(p,2));
    }
    // greedy, for last channel, add the remaining packages
    // else plus the heaviest one to each channel
    static int helper(int[] packages, int channels){
        Arrays.sort(packages);
        int ans = 0;
        for(int i = 0; i < channels - 1; i++){
            ans += packages[packages.length - i - 1];
        }
        int sum = 0;
        for (int i = 0; i <= packages.length - 1 - channels - 1; i++) {
            sum += packages[i];
        }

        ans += (sum)/(packages.length - 1 - channels - 1);

        return ans;
    }
}
