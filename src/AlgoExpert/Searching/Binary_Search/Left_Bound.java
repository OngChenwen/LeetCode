package AlgoExpert.Searching.Binary_Search;

public class Left_Bound {
    //主要来求一个有序数组中，有重复的数字，让你去找重复数字最左边的边界或者第一个大于该数字的
    public static int left_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left<= right){
            int mid = left + (right - left)/2;
            if (nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid -1;
            } else if (nums[mid] == target){
                // 固定左边， 动右边
                right = mid - 1;
            }
        }

        //检查越界
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }

    public static void main(String[] args) {
        int[] numbers = {2};
        System.out.println(left_bound(numbers,2));
    }
}
