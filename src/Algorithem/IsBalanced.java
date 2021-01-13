package Algorithem;

import java.util.Stack;

public class IsBalanced {
    // get number of input character
    public int checkInputBrackets(char ch){
        switch (ch){
            case '(' : return -1;
            case '[' : return -2;
            case '{' : return -3;

            case ')' : return 1;
            case ']' : return 2;
            case '}' : return 3;
        }
        return 0;
    }

    public boolean Balanced(String s){
        Stack<Character> stack = new Stack<>();
        int counter = 0;

        if(s.isEmpty()){
            return false;
        }

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            int number = checkInputBrackets(ch);
            // 左括号 push到 stack
            if(number<0){
                counter ++;
                stack.push(ch);
            }
            // 右括号
            if (number>0){
                counter++;
                // 不存在左括号
                if(stack.isEmpty()) return false;
                // 检查是否有匹配的左括号
                if(number + checkInputBrackets(stack.peek()) == 0){
                    //存在 匹配的左括号， stack 去除匹配了的左括号
                    stack.pop();
                    System.out.println("Success");
                }
            }
        }

        if(counter>0 && stack.isEmpty()){
            return true;
        }
        return false;
    }
}
