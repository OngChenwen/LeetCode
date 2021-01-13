package Algorithem;

import java.util.Arrays;

public class ArraysEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String String1 = "";
        String String2 = "";
        for (int i = 0; i < word1.length; i++) {
            String1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            String2 += word2[i];
        }

        System.out.println("S1: " + String1);
        System.out.println("S2: " + String2);
        if (String1.equals(String2)){
            return true;
        } else{
            return false;
        }
    }

}
