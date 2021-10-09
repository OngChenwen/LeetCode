package DoorDash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiskSpaceAnalysis {
    static int getMax(int[] nums, int k){
        int max = 0;
        if(k == 1 || k == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max,nums[i]);
            }

            return max;
        }

        int left = 0, right = k - 1;
        List<Integer> res = new ArrayList<>();
        while(right < nums.length){
            List<Integer> tmp = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                tmp.add(nums[i]);
            }
            int min = Collections.min(tmp);
            res.add(min);
            right++;
            left++;
        }


        return Collections.max(res);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{8,2,4,6};
        System.out.println(getMax(numbers,3));
    }
}
