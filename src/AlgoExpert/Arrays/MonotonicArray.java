package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MonotonicArray {
    public static boolean isMonotonic_1(int[] array) {
        if (array.length == 0 ||array.length ==1) return true;
        List<Boolean> resultIncreasing = new ArrayList<>();
        List<Boolean> resultDecreasing = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            int pre = array[i-1];
            if (array[i] > pre){
                resultIncreasing.add(true);
            } else {
                resultIncreasing.add(false);
            }
        }

        for (int i = 1; i < array.length; i++) {
            int pre = array[i-1];
            if (array[i] < pre){
                resultDecreasing.add(true);
            } else {
                resultDecreasing.add(false);
            }
        }

        return resultDecreasing.contains(false) || resultIncreasing.contains(false);
    }

    //find the counter Case
    public static boolean isMonotonic_2(int[] array) {
        boolean down = true;
        boolean up = true;
        for (int i = 1; i < array.length ; i++) {
            if(array[i - 1] < array[i]) down = false;
            if(array[i - 1] > array[i]) up = false;
        }

        return down || up;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};

        System.out.println(isMonotonic_1(array));

    }
}
