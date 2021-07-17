package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class Leet1079 {
    // unsolved
    static List<String> ans = new ArrayList<>();
    public static int numTilePossibilities(String tiles) {
        backTracking(ans,0, new StringBuffer(), tiles);
        return ans.size();
    }

    public static void backTracking(List<String> list, int start, StringBuffer stringBuffer, String titles){
    }

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
