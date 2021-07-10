package AlgoExpert.Arrays;

import java.util.*;

public class TwoNumberSum {
    //brute force
    public static int[] twoNumberSum_Solution_1(int[] array, int target){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] + array[j] == target){
                    return new int[]{array[i],array[j]};
                }
            }
        }

        return new int[]{};
    }

    //Set - record each balance

    public static int[] twoNumberSum_Solution_2(int[] array, int target){

        Set<Integer> integers = new HashSet<>();
        for (int value : array) {
            // check whether set contain balance for current element
            int balance = target - value;

            if (integers.contains(balance)) {
                return new int[]{value, balance};
            } else {
                // if it doesn't, add value as balance
                integers.add(value);
            }
        }

        return new int[]{};
    }

    //Two Pointers
    public static int[] twoNumberSum_Solution_3(int[] array, int target){
        //Sort Array as ascending order
        Arrays.sort(array);
        int left = 0 , right = array.length - 1;

        while (left < right){
            if(array[left] + array[right] == target){
                return new int[]{ array[left] , array[right]};
                // if sum > target, need to scale back the large number(right pointer)
            }  else if (array[left] + array[right] > target){
                    right--;
                // if sum < target, need to scale up the small number(left pointer)
            }  else if(array[left] + array[right] < target){
                left++;
            }
        }

        return new int[]{};
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum_Solution_3(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    }

}
