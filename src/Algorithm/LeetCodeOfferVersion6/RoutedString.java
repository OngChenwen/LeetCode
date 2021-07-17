package Algorithm.LeetCodeOfferVersion6;

import java.util.HashSet;
import java.util.Set;

public class RoutedString {

    public boolean isFlipedString(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length() ; i++) {
            if (!set.contains(s2.charAt(i))) return false;
        }

        return true;
    }

    public boolean FlipedString(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        String s = s2 + s2;
        return s.contains(s1);
    }

}
