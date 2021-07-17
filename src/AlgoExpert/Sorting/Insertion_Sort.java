package AlgoExpert.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    // 扑克牌算法
    static void insertionSort(int[] array){
        if(array == null) return;

        int n = array.length;
        // 默认 第一个数字的位置是正确的，所以 需要排序的位置从 1 开始（第二个数）
        for (int i = 1; i < n ; i++) {
            // 记录下当前需要插入的数字的位置，即 目标数的原位置
            int j = i;
            // 记录当前要排序的那个数字，即 目标数
            int target = array[j];
            // 指针从后往前查找并比较，如果当前位置的前一个数字比 目标数大，则一次将 位置 j 后的数字移动一个格子
            // 腾出所需"插牌"位置
            while(j>0 && array[j-1] > target){
                array[j] = array[j-1];
                j--;
            }
            // 更新目标数值
            // "插牌"
            array[j] = target;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,5,38,47,22,21,56};
        insertionSort(nums);
        // result : 3, 5, 21, 22, 38, 47, 56
        System.out.println(Arrays.toString(nums));
    }
}
