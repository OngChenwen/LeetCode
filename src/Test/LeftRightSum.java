package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeftRightSum {

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,3,4,6,5,10};
        System.out.println(helper(arr));
    }

    static int helper(int[] nums){

        for(int i = 1; i < nums.length;i++){
            int left = 0, right = 0;
            for(int j = 0; j < i; j++){
                left += nums[j];
            }

            for(int k = i + 1; k < nums.length; k++){
                right += nums[k];
            }

            if(left == right) return i;
        }

        return  -1;
    }




}
