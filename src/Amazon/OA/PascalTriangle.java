package Amazon.OA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7};
        System.out.println(helper(arr));
    }
    static String helper(int[] numbers){
        List<Integer> tmp = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        while (tmp.size() > 2){
            List<Integer> path = new ArrayList<>();
            for (int i = 0; i < tmp.size() - 1; i++) {
                int num = (tmp.get(i) + tmp.get(i+1)) % 10;
                path.add(num);
            }
            // update for next loop
            tmp = path;
        }

        StringBuilder sb = new StringBuilder();
        for (Integer integer : tmp) {
            sb.append(integer);
        }

        return sb.toString();
    }
}
