package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class AllSubString {
    static List<String> lists = new ArrayList<>();

    public static String[] permutation(String S) {
        char[] chars = S.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        dfs(chars, stringBuffer);

        int len = lists.size();
        String[] res = new String[len];
        // 遍历结果到数组
        for (int i = 0; i < len; i++) {
            res[i] = lists.get(i);
        }
        return res;

    }


    public static void dfs(char[] chars, StringBuffer stringBuffer) {
        // 1.截止条件
        if (stringBuffer.length() == chars.length) {
            lists.add(stringBuffer.toString());
            return;
        }

        // 2.遍历候选节点
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // 2.1 筛选
            if (chars[i] != '0') {
                stringBuffer.append(c);
                chars[i] = '0';
                dfs(chars, stringBuffer);
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                chars[i] = c;
            }
        }
    }

    public static void main(String[] args) {
        String[] result = permutation("qwe");
        for (String c: result) {
            System.out.println(c);
        }
    }
}
