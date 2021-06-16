package Algorithem.LeetCodePractice_Random;

public class findDuplicate {
    static int Duplicate(int[] nums){
        int output = 0;

        int[] results = new int[nums.length];
        for (int num : nums) {
            results[num]++;
        }

        for (int i = 0; i < results.length ; i++) {
//            System.out.println("index" + i + " :"  + results[i]);
            if (results[i] != 1 && results[i] != 0) output = i;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(Duplicate(nums));
    }
}
