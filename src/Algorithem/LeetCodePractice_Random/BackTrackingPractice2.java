package Algorithem.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackTrackingPractice2 {
    List<String> ans = new ArrayList<>();
    List<String> letterCombinations(String digits){
        if(digits.length() == 0) return ans;

        Map<Character,String> phoneMap = new HashMap<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

        backtrack(ans,phoneMap,digits,0, new StringBuffer());
        return ans;
    }

    void backtrack(List<String> ans, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination){
        if(index==digits.length()){
            ans.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i <lettersCount ; i++) {
                combination.append(letters.charAt(i));
                backtrack(ans,phoneMap,digits,index+1,combination);
                combination.deleteCharAt(index);
            }

        }
    }
}
