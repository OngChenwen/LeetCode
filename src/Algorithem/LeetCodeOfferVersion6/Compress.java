package Algorithem.LeetCodeOfferVersion6;

import java.util.*;

public class Compress {
//    public static String compressString(String s){
//        StringBuilder result = new StringBuilder();
//        int counter = 0;
//        Map<Character, Integer> direct = new HashMap<>();
//        for (int i = 0; i < s.length() ; i++) {
//            if(direct.containsKey(s.charAt(i))){
//                counter++;
//                direct.put(s.charAt(i),counter);
//            } else {
//                direct.put(s.charAt(i),counter);
//                counter = 1;
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : direct.entrySet()) {
//            result.append(entry.getKey());
//            result.append(entry.getValue());
//
//        }
//
//        if (s.length() < result.toString().length()){
//            return s;
//        } else {
//            return result.toString();
//        }

public String compressString(String S) {
    if (S.length() < 3) return S;
    StringBuffer buffer = new StringBuffer();
    int count = 1;
    for (int i = 1; i < S.length(); i++) {
        if (i == S.length() - 1) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                buffer.append(S.charAt(i - 1)).append(count + 1);
            } else {
                buffer.append(S.charAt(i - 1)).append(count).append(S.charAt(i)).append(1);
            }
        }
        else if (S.charAt(i) == S.charAt(i - 1)) {
            count++;
        } else {
            buffer.append(S.charAt(i - 1)).append(count);
            count = 1;
        }
    }
    return buffer.length() < S.length() ? buffer.toString() : S;
}



}
