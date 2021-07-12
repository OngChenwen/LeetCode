package AlgoExpert.Arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int pointerOne = 0;
        int pointerTwo = 0;

        int[] result = new int[2];
        int smallDiff= Integer.MAX_VALUE;

        while (pointerOne < arrayOne.length && pointerTwo < arrayTwo.length){
            int a = arrayOne[pointerOne];
            int b = arrayTwo[pointerTwo];
            if (a < b){
                pointerOne++;
            }else if (a > b){
                pointerTwo++;
            } else {
                // a == b, abs(a-b) == 0
                return new int[]{a,b};
            }

            // else compare non-zero difference
            int currentDiff = Math.abs(a - b);
            if (currentDiff < smallDiff){
                smallDiff  = currentDiff;
                result[0] = a;
                result[1] = b;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[] {-1, 5, 10,20 ,28,3};
        int[] arrayTwo = new int[] {26,134,135,15,17};

        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
    }
}
