package Amazon;

import java.util.Stack;

//There are 3 rules for a valid string:
//        An empty string is valid
//        You can add same character to a valid string X, and create another valid string yXy
//        You can concatenate two valid strings X and Y, so XY will also be valid.
//        Ex: vv, xbbx, bbccdd, xyffyxdd are all valid.
public class ValidString {
    public static void main(String[] args) {
        String s = "xyffyx";
        System.out.println(helper(s));
    }

    static boolean helper(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (stack.isEmpty() || stack.peek() == c) stack.push(c);
            else stack.pop();
        }

        return stack.isEmpty();
    }
}
