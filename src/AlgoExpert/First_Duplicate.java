package AlgoExpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class First_Duplicate {
    public int firstDuplicateValue(int[] array) {
       Set<Integer> set = new HashSet<>();

        for (int value: array) {
            if (set.contains(value)) return value;
            set.add(value);
        }

        return -1;
    }
}
