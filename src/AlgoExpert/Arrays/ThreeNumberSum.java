package AlgoExpert.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    // Two Pointers
    public static List<Integer[]> threeNumberSum(int[] array, int target){
        Arrays.sort(array);
        List<Integer[]> res = new ArrayList<>();
        // window is from the next value of i and the end of array
        // -8,-6,1,2,3,5,6,12
        // -8,[-6,1,2,3,5,6,12]
        //  i,left,       right
        // loop array.length - 2 times
        for (int i = 0; i < array.length - 2; i++) {

            int left = i+1, right = array.length - 1;
            while (left<right){
                int currentSum = array[left] + array[i] + array[right];
                if( currentSum == target){
                    res.add(new Integer[]{array[left],array[i],array[right]});
                    left++;
                    right++;
                } else if(currentSum < target){
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }

    //Brute force
    public static List<Integer[]> bruteForce(int[] array, int target){
        List<Integer[]> res = new ArrayList<>();
        for (int i = 0; i <  array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    int currentSum = array[j] + array[i] + array[k];
                    if( currentSum == target){
                        res.add(new Integer[]{array[i],array[j],array[k]});}
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] array = new int[]{12,3,1,2,-6,5,-8,6};
        List<Integer[]> integers = bruteForce(array, 0);
        for (Integer[] value : integers) {
            System.out.println(Arrays.toString(value));
        }
    }
}
