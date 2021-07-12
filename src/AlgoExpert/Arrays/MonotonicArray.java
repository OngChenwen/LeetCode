package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
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
            } else if (pre > array[i]){
                resultIncreasing.add(false);
            }
        }

        for (int i = 1; i < array.length; i++) {
            int pre = array[i-1];
            if (array[i] < pre){
                resultDecreasing.add(true);
            } else  if (array[i] > pre){
                resultDecreasing.add(false);
            }
        }

        return checkAll(resultDecreasing) || checkAll(resultIncreasing);
    }

    public static boolean checkAll(List<Boolean> list){
        boolean flag = true;

        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i)) flag = false;
        }

        return flag;
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
