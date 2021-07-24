package leetCode.Array.Date_07_24;

import java.util.HashMap;
import java.util.Map;

public class Leet_1_Two_Sum {
    public int[] twoSum(int[] nums, int target){
        // balance, index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(target - nums[i])) return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i],i);
        }

        return new int[]{};
    }


}
