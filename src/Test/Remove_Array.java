package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_Array {

    public static void main(String[] args) {
        int[] array = new int[]{1,4,6,8,9};
        System.out.println(Arrays.toString(array));
        int[] res = remove(array,1);

        System.out.println(Arrays.toString(res));

    }

    static int[] remove(int[] nums, int index){
        for(int i = index; i <nums.length - 1;i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = 0;

        return Arrays.copyOfRange(nums,0,nums.length - 1);
    }
}
