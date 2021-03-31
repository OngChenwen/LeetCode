package Binary_Search;

public class Right_Bounded {
    //主要来求一个有序数组中，有重复的数字，让你去找重复数字最右边的边界
    static int right_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while (left<= right){
            int mid = left + (right - left)/2;
            if (nums[mid] > target){
                right = mid - 1;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] == target){
                left = mid + 1;
            }
        }

        //检查越界
        if (right < 0 || nums[right] != target){
            return -1;
        }
        return right;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,2,2,2,3};
        System.out.println(right_bound(numbers,2));
    }
}
