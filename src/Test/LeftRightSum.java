package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeftRightSum {

    public static void main(String[] args) {
        int[] arr = new int[]{6,2,3,4,6,5,10};
        System.out.println(helper1(arr));
    }

    static int helper1(int[] nums){

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

    static int helper(int[] arr){
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1; i < arr.length;i++){
            pre[i] = pre[i - 1] + arr[i];
        }

        for(int i = 1; i < pre.length; i++){
            if(pre[i - 1]  == pre[pre.length - 1] - pre[i]) return i;
        }
        return -1;
    }




}
