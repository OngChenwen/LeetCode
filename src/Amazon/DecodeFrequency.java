package Amazon;

public class DecodeFrequency {
    public static void main(String[] args) {
        String s = "1226#24#";
        System.out.println(helper(s));
    }

    static String helper(String input){
        int[] res = new int[26];
        char[] chars = input.toCharArray();
        int n = input.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (chars[i] == ')'){
                int k = i - 1, carry = 1;
                while(k >= 0 && chars[k] != '('){
                    count = carry * (chars[k] - '0') + count;
                    k--;
                    carry *= 10;
                }
                // i = k + 1 or i = k - 1 ?
                i = k;
            } else if(chars[i] == '#'){
                int number = (chars[i - 2] - '0') * 10 + (chars[i - 1] - '0');
                res[number - 1] += count == 0 ? 1 : count;
                i -= 2;
                count = 0;
            } else if(Character.isDigit(chars[i])){
                int number = (chars[i] - '0');
                res[number - 1] += count == 0 ? 1 : count;
                count = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num: res) {
            sb.append(num).append(" ");
        }

        return sb.toString().trim();
    }
}
