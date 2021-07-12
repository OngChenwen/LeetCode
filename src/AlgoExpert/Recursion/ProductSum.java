package AlgoExpert.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static int productSum(List<Object> array){
        return getTotal(1,array);
    }

    public static int getTotal(int depth, List<Object> array){
        int sum = 0;
        for (Object value: array) {
            if(value instanceof List<?>){
                sum += (getTotal(depth + 1, (ArrayList) value) * depth);
            } else {
                sum += ((int)value * depth);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Object> objects = Arrays.asList(5, 2, Arrays.asList(7, -1), 3, Arrays.asList(6, Arrays.asList(-13, 8), 4));
        System.out.println(productSum(objects));
    }
}
