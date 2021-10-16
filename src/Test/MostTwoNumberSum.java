package Test;

import java.util.Scanner;

public class MostTwoNumberSum {

    static int i = 0, j = 0, actual;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size;i++) {
            arr[i] = input.nextInt();
        }

        input.nextLine();

        int t = input.nextInt();

        findNearestElements(arr,t);

//        if(i == 0 && j == 0) {
//            for(int i = t; i>=0;i--) {
//                findNearestElements(arr, i);
//                if(i != 0 && j != 0) {
//                    break;
//                }
//            }
//        }

        System.out.println("Exact, or Nearest, elements that add to target value " + t + " are found at index " + i + " and index " + j + " adding to " + actual);
    }

    // time complexity O(tn) which t is the target number
    // space complexty O(n);
    static void findNearestElements(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mindiff = Integer.MAX_VALUE;


        while(left < right) {
            int sum = nums[left] + nums[right];
            int diff = target - sum;

            if(diff< 0){
                right--;
            } else if(diff > 0){
                // keep update the closest sum and index of left & right pointer
                if(diff < mindiff){
                    mindiff = diff;
                    i = left;
                    j = right;
                    actual = sum;
                }

                left++;
            } else {
                // if diff = 0, just return the exactly two number's index and value
                i = left;
                j = right;
                actual = sum;
                break;
            }

        }


    }
}
