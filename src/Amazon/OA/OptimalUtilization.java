package Amazon.OA;

import java.util.*;

public class OptimalUtilization {
    public static void main(String[] args) {
        List<int[]> a = Arrays.asList(new int[]{1,8}, new int[]{2,15}, new int[]{3,9});
        List<int[]> b = Arrays.asList(new int[]{1,8}, new int[]{2,11}, new int[]{3,12});
        List<int[]> res = helper(a,b,20);

        for (int[] pair: res) {
            System.out.println(Arrays.toString(pair));
        }
    }

    static List<int[]> helper(List<int[]> a, List<int[]> b, int target){
        a.sort(Comparator.comparingInt(o -> o[1]));
        b.sort(Comparator.comparingInt(o -> o[1]));

        int max = Integer.MIN_VALUE;
        int n = a.size(), m = b.size(), i = 0, j = m - 1;
        List<int[]> ans = new ArrayList<>();

        while(i < n && j >= 0){
            int sum = a.get(i)[1] + b.get(j)[1];
            if (sum > target) {
                j--;
            } else if(sum >= max){
                // greater than max , update result
                if (sum > max){
                    max = sum;
                    ans.clear();
                }
                // equal max
                ans.add(new int[]{a.get(i)[0],b.get(j)[0]});
                int idx = j - 1;
                while (idx >= 0 && b.get(idx)[1] == b.get(idx + 1)[1]) {
                    ans.add(new int[]{a.get(i)[0], b.get(idx)[0]});
                    idx--;
                }
            }
            i++;
        }

        return ans;
    }
}
