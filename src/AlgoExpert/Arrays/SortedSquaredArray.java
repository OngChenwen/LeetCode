package AlgoExpert.Arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    // input array is sorted

    // Sort and update each element with its squared result;
    public static int[] sortedArray_1(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i],2);
        }

        return array;
    }

    //Two Pointers
    public static int[] sortedArray_2(int[] array){
        int left = 0, right = array.length - 1;
        int[] res = new int[array.length];

        for (int i = array.length - 1; i >=0; i--) {
            if (Math.abs(array[left]) < Math.abs(array[right])){
                res[left] = array[left] * array[left];
                left++;
            } else {
                res[right] = array[right] * array[right];
                right--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(sortedArray_1(array)));
    }
}
