package Algorithem;

public class ReverseString {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()) + s.substring(0,n);
    }
}
