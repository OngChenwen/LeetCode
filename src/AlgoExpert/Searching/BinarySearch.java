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
    
    public static int Binary_2D_Search(int[][] matrix, int target){
        int position = 0;
        for (int[] value : matrix) {
            position = binary_search(value,target);
        }
        
        return position;
    }

    public static void main(String[] args) {
        int[][] numbers = {{2,5,8,12,19},{1,3,4,5,15}};
        System.out.println((Binary_2D_Search(numbers,5)));
    }
}
