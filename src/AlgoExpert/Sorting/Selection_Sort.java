package AlgoExpert.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    static void selectionSort(int[] array){
        if(array == null) return;

        int n = array.length;
        // 改良版的 冒泡排序， 仍然循环 n - 1 次
        for (int i = 0; i < n - 1 ; i++) {
            // 记录最小值的index，默认值为 当前的当前所需排序数字为最小值
            int minIdx = i;
            // 因为查找当前数字往后的数字，所以起点为 i + 1， j ＜ n
            for (int j = i + 1; j < n; j++) {
                // 如何发现更小的数字， 则更新最小数字的位置
                if (array[minIdx] > array[j]) minIdx = j;
            }
            // 如果最小数字不为当前需要排序所在的位置，则将最小值和当前排序位置的数值进行交换
            if(minIdx != i){
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,38,47,22,21,56};
        selectionSort(nums);
        // result : 3, 5, 21, 22, 38, 47, 56
        System.out.println(Arrays.toString(nums));
    }
}
