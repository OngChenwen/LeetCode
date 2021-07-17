package Algorithm.LeetCodePractice_Random;

public class MaxNum {
    public int maximum69Number (int num) {
        String n = String.valueOf(num);
        String result = n.replaceFirst("6", "9");
        return Integer.parseInt(result);
    }

}
