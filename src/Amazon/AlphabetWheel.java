package Amazon;

public class AlphabetWheel {
    public static void main(String[] args) {
        String s = "VTAOG";
        System.out.println(helper(s,2));
    }

    static String helper(String input, int k){
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i];
            // check whether the element after looking back still in front of 'A'
            if (ch - k >= 'A'){
                chars[i] = (char)(ch - k);
            } else{
                chars[i] = (char)(ch - k + 26);
            }
        }

        return new String(chars);
    }
}
