package AlgoExpert.Sorting;

import java.util.Arrays;

public class Quick_Sort {

//    快速排序也采用了分治的策略，这里引入了‘基准数’的概念。
//
//    找一个基准数（一般将待排序的数组的第一个数作为基准数）
//    对数组进行分区，将小于等于基准数的全部放在左边，大于基准数的全部放在右边。
//    重复1，2步骤，分别对左右两个子分区进行分区，一直到各分区只有一个数为止。

    static void quickSort(int[] array, int left, int right){
        if (left < right){
            int temp = qSort(array, left, right);
            quickSort(array, left, temp - 1);
            quickSort(array,temp + 1, right);

        }
    }

    /**
     * 排序过程
     * @param arr 待排序数组
     * @param left 待排序数组最小下标
     * @param right 待排序数组最大下标
     * @return 排好序之后基准数的位置下标，方便下次的分区
     */
    public static int qSort(int[] arr,int left,int right) {
        int baseNum=arr[left];//定义基准数，默认为数组的第一个元素
        while(left<right) {//循环执行的条件
            //因为默认的基准数是在最左边，所以首先从右边开始比较进入while循环的判断条件
            //如果当前arr[right]比基准数大，则直接将右指针左移一位，当然还要保证left<right
            while(left<right && arr[right]>baseNum) {
                right--;
            }
            //跳出循环说明当前的arr[right]比基准数要小，那么直接将当前数移动到基准数所在的位置，并且左指针向右移一位（left++）
            //这时当前数（arr[right]）所在的位置空出，需要从左边找一个比基准数大的数来填充。
            if(left<right) {
                arr[left] = arr[right];
                left++;
            }
            //下面的步骤是为了在左边找到比基准数大的数填充到right的位置。
            //因为现在需要填充的位置在右边，所以左边的指针移动，如果arr[left]小于或者等于基准数，则直接将左指针右移一位
            while(left<right && arr[left]<=baseNum) {
                left++;
            }
            //跳出上一个循环说明当前的arr[left]的值大于基准数，需要将该值填充到右边空出的位置，然后当前位置空出。
            if(left<right) {
                arr[right]=arr[left];
                right--;
            }
        }
        //当循环结束说明左指针和右指针已经相遇。并且相遇的位置是一个空出的位置，
        //这时候将基准数填入该位置，并返回该位置的下标，为分区做准备。
        arr[left]=baseNum;
        return left;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,5,38,47,22,21,56};
        quick(nums,0, nums.length - 1);
        // result : 3, 5, 21, 22, 38, 47, 56
        System.out.println(Arrays.toString(nums));
    }

    static void quick(int[] nums, int left, int right){
        if(left > right) return;
        int mid = left + (right - left)/2;
        int pivot = nums[mid];
        int i = left,j = right;
        while(i<=j){
            while(i <= j && nums[i] < pivot){
                i++;
            }

            while(i <= j && nums[j] > pivot){
                j--;
            }
            if(i <= j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            }
        }

        quick(nums,left,j);
        quick(nums,i,right);
    }
}
