package Algorithm.LeetCodePractice_Random;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayByFre {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    static int[] frequencySort(int[] nums){
        Map<Integer,Integer> fre = new HashMap<>();
        List<Integer> tmp = new ArrayList<>();
        for (int num: nums) {
            fre.put(num,fre.getOrDefault(num,0) + 1);
            tmp.add(num);
        }

        tmp.sort((a, b) -> fre.get(a) == fre.get(b) ? b.compareTo(a) : fre.get(a).compareTo(fre.get(b)));

        return tmp.stream().mapToInt(Integer::intValue).toArray();
    }
}
