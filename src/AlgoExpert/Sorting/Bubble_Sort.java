package AlgoExpert.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    static void bubbleSort(int[] array){
        if (array == null) return;
        int n = array.length;

        // total loop n - 1 times for sorting
        for (int i = 0; i < n - 1  ; i++) {
            // choose two elements to compare each other, if the current one larger than the next one
            // (current one smaller than previous one), swap them.
            // 保证 array[j+1] 不越界， j < n - 当前次数 - 1
            for (int j = 0; j < n - i - 1 ; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j + 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,38,47,22,21,56};
        bubbleSort(nums);
        // result : 3, 5, 21, 22, 38, 47, 56
        System.out.println(Arrays.toString(nums));
    }
}
