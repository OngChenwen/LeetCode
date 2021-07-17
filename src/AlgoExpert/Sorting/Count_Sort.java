package AlgoExpert.Sorting;

import java.util.Arrays;

public class Count_Sort {
    // 牺牲空间 换 时间
    // 必须知道数组的范围
     static void countSort(int[] array){
         if(array == null) return;

         int n = array.length;
         // 默认 数组中 最大值 和 最小值 均为 数组中第一个元素
         int maxNumber = array[0];
         int minNumber = array[0];
         // 遍历数组 找出数组中真正的 最大值 和 最小值
         for (int i = 1; i < n ; i++) {
             maxNumber = Math.max(maxNumber,array[i]);
             minNumber = Math.min(minNumber,array[i]);
         }
         // 创建 临时数字 统计每个数字出现的次数
         int[] temp = new int[maxNumber + 1];
         for (int value : array) {
             temp[value]++;
         }
         // 记录原数组的index
         int k = 0;
         // 为原数组赋值，起点为原数组中最小值的位置
         for (int i = minNumber; i < temp.length; i++) {
             // 当所记录的次数大于0时，更新原数组
             while (temp[i] > 0){
                 array[k] = i;
                 k++;
                 temp[i]--;
             }
         }
     }

    public static void main(String[] args) {
        int[] nums = new int[]{3,59,59,59,5,38,47,22,21,56};
        countSort(nums);
        // result : 3, 5, 21, 22, 38, 47, 56, 59, 59, 59
        System.out.println(Arrays.toString(nums));
    }
}
