package Algorithm.LeetCodePractice_Random;

public class ReverseString {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}
