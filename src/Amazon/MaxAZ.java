package Amazon;

// String add one A to get maximum "AZ"
public class MaxAZ {
    public static void main(String[] args) {
        String string = "BAZAZ";
        System.out.println(helper(string));
    }

    static int helper(String input){
        String As = "A" + input;
        String Bs = input + "Z";
        return Math.max(calculate(As), calculate(Bs));
    }

    static int calculate(String input){
       int left = 0, right = 0;
       int count = 0;
       char[] chars = input.toCharArray();
       while(right < chars.length){
            while(chars[right] == 'Z' && left < right){
                if(chars[left] == 'A') count++;
                left++;
            }
            left = 0;
            right++;
       }

       return count;
    }
}
