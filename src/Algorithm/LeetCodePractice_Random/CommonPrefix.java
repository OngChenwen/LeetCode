package Algorithm.LeetCodePractice_Random;

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        String first = strs[0];
        //第一个作为 模板， 如果不同就减小模板的length
        for (String s: strs) {
            while (!s.startsWith(first)){
                first = first.substring(0,first.length()-1);
            }
        }

        return first;
    }
}
