package Algorithm.LeetCodePractice_Random;

import java.util.LinkedList;
import java.util.List;

// LeetCode 22
public class BackTrackingPractice1 {
    List<String> ans = new LinkedList<>();
    public List<String> generateParenthesis(int n){
        backtrack(0,0,n,"");
        return ans;
    }

    public void backtrack(int left, int right, int n, String path){
        // 非法结束条件（剪枝）
        if(left > n || left < right) return;
        // 结束条件
        if(left + right == 2 * n) {
            ans.add(path);
            return;
        }
        // 两种选则情况
        backtrack(left+1, right, n, path + "(");
        backtrack(left, right+1, n, path + ")");
    }

}
