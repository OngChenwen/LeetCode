package AlgoExpert.Arrays;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    static Set<Integer> set = new HashSet<>();
    public static boolean isHappy(int n){
        if(n == 1) return true;
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            int number = aChar - '0';
            sum += number * number;
        }

        if (set.contains(sum)) return false;
        set.add(sum);

        return isHappy(sum);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
