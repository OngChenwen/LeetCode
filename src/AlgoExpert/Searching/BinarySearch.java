package AlgoExpert.Searching;

public class BinarySearch {
    //查找具体值
    public static int binary_search(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while (left<= right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target){
                return mid;
            } else if(nums[mid]< target){ // 需要往右找
                left = mid + 1;
            } else if (nums[mid] > target){ //需要往左找
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {0,1,21,33,45,45,61,71,72,73};
        System.out.println(binary_search(numbers,33));
    }
}
