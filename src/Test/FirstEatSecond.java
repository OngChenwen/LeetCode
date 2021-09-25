package Test;

import java.util.Scanner;

public class FirstEatSecond {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }


        System.out.println("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int[] res = FirstSecond(array);
        System.out.println();
        System.out.println("Result: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] FirstSecond(int[] nums){
        int size  = 0;
        for (int i = 0; i < nums.length; i++) {
            size = Math.max(size,nums[i]);
        }

        int[] fre = new int[size + 1];
        // count frequency
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        // get Max frequency and secMax frequency
        int max = 0, secMax = 0, maxFreNumber = 0, secMaxFreNumber = 0;
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] > max){
                secMax = max;
                max = fre[i];
            } else {
                if(fre[i] > secMax)
                    secMax = fre[i];
            }
        }
        //get Max and secMax number
        for (int i = 1; i < fre.length ; i++) {
            if(fre[i] == secMax ){
                secMaxFreNumber = i;
            }

            if (fre[i] == max){
                maxFreNumber = i;
            }
        }
        // secMax == 0 -> 1 1 1 1 1
        // Max = 1 -> 1 2 3 4 5
        if (secMax == 0 || max == 1) return nums;

            for (int i = 0; i < nums.length ; i++) {
                if (nums[i] == maxFreNumber) {
                    nums[i] = secMaxFreNumber;
                }
            }


            return  nums;

    }

}
