package Algorithm.LeetCodePractice_Random;

public class findSingleNum {
    static int singleNumber(int[] nums){
        int output = 0;

        int[] results = new int[10000];
        for (int num : nums) {
            results[num]++;
        }

        for (int i = 0; i < results.length ; i++) {
//            System.out.println("index" + i + " :"  + results[i]);
            if (results[i] ==1) output = i;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {9,1,7,9,7,9,7};
        System.out.println(singleNumber(nums));
    }
}
