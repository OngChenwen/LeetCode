package AlgoExpert;

import java.util.HashMap;
import java.util.Map;

public class First_Non_Repeat {
    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length() ; i++) {
            char c = string.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c,1);
            } else {
                map.put(c , map.get(c) + 1);
            }
        }

        for (int i = 0; i < string.length() ; i++) {
            char ch = string.charAt(i);
            if (map.get(ch) == 1 ) return i;
        }

        return -1;
    }

}
