package Algorithm.LeetCodePractice_Random;

public class ArraysEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder String1 = new StringBuilder();
        StringBuilder String2 = new StringBuilder();
        for (String value : word1) {
            String1.append(value);
        }

        for (String s : word2) {
            String2.append(s);
        }

        System.out.println("S1: " + String1);
        System.out.println("S2: " + String2);
        return String1.toString().equals(String2.toString());
    }

}
