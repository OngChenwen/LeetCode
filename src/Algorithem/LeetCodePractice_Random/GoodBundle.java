package Algorithem.LeetCodePractice_Random;

public class GoodBundle {
    public int numIdenticalPairs(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && i<j){
                    counter++;
                }
            }
        }
        return counter;
    }
}
