package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        if (array.length == 0 ||array.length ==1) return true;
        List<Boolean> resultIncreasing = new ArrayList<>();
        List<Boolean> resultDecreasing = new ArrayList<>();
        int pre = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= pre){
                pre = array[i];
                resultIncreasing.add(true);
            } else {
                pre = array[i];
                resultIncreasing.add(false);
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pre){
                pre = array[i];
                resultDecreasing.add(true);
            } else {
                pre = array[i];
                resultDecreasing.add(false);
            }
        }

        return resultDecreasing.contains(true) && resultIncreasing.contains(true);
    }
}
