package HackerRank.Week1.Day1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Mini_Max_Sum {

    static void minMaxSum(List<Integer> array){
        Collections.sort(array);
        double minSum = 0, maxSum = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            minSum += array.get(i);
        }

        for (int i = 1; i < array.size(); i++) {
            maxSum += array.get(i);
        }

        System.out.println(minSum + "  "+ maxSum);
    }
}
