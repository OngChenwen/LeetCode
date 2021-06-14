package Algorithem;

import java.util.HashSet;
import java.util.Set;

public class CheckIfDuplicate {

    public boolean checkIfPangram(String sentence) {
        int[] collections= new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            // 直接 - a 可以得到位置
            collections[sentence.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < collections.length ; i++) {
            if (collections[i] == 0) return false;
        }

        return true;
    }
}
