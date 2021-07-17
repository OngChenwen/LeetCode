package Algorithm.LeetCodeOfferVersion6;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Set<Character> characters = new HashSet<>();

        for (char c: chars){
            if (!characters.contains(c)){
                characters.add(c);
            } else {
                characters.remove(c);
            }
        }

        return characters.size()<=1;
    }
}
