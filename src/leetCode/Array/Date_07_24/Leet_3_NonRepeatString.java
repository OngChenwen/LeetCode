package leetCode.Array.Date_07_24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leet_3_NonRepeatString {

    // two Pointers
    public int lengthOfLongestSubstring(String s){
        if (s.length() == 1) return 0;

        Map<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0, ans = 0;

        while (right < s.length()){
            if (map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)),left);
            }

            map.put(s.charAt(right),right);
            right++;
            ans = Math.max(ans,right - left);

        }

        return ans;
    }
}
