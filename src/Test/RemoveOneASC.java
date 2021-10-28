package Test;

import java.util.Scanner;

public class RemoveOneASC {
//    static int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
    static int index = -1, count =0,t = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        boolean flag = helper(arr);


        if (index == -1 && count == 0) {
            System.out.println("Array is OK. No removed value");
        } else if (flag){
            System.out.println("Array is OK. Removed value " + arr[index] + " at index " + index);
        } else {
            System.out.println("No Solution Exists!");
        }

    }

    static boolean helper(int[] nums){
        int n = nums.length;

        for(int i = 1; i < n ; i++){
            if (nums[i - 1] >= nums[i]){
                count++;
                index = i;
            }
        }
        if (count > 1) return false;
        if (count == 0) return true;
        if(index == 1) {
            index = index - 1;
            return true;
        }
        if (index == n - 1) return true;
        if (nums[index - 1] < nums[index + 1]) return true;
        if (nums[index - 2] < nums[index]) {
            index = index - 1;
            return true;
        }


        return false;
    }
}
