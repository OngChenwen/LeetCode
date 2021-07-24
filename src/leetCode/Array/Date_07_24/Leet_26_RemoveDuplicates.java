package leetCode.Array.Date_07_24;

public class Leet_26_RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if ( slow == 0 ||nums[slow - 1] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }

        return slow;
    }
}
