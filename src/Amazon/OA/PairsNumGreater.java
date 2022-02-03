package Amazon.OA;

public class PairsNumGreater {
    // Given a sorted list of numbers and a target Z,
    // return the number of pairs according to following definition: (X,Y) where X+Y >= Z

    //Input: arr = [1, 3, 7, 9, 10, 11], Z = 7
    //Output: 14

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,7,9,10,11};
        System.out.println(helper(nums,7));
    }

    static int helper(int[] arr, int target){
        int left = 0, right = arr.length - 1, ans = 0;

        while(left < right){
            if(arr[left] + arr[right] >= target){
                ans += right - left;
                right--;
            } else{
                left++;
            }
        }

        return ans;
    }

}
