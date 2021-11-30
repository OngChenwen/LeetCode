package Algorithm.LeetCodePractice_Random;

import java.util.ArrayList;
import java.util.List;

public class Leet1079 {
    static List<String> ans = new ArrayList<>();
    public static int numTilePossibilities(String tiles) {
        for (int i = 1; i <=tiles.length(); i++) {
            backTracking(tiles, new boolean[tiles.length() + 1],i,1,new StringBuilder());
        }
        System.out.println(ans);
        return ans.size();
    }

    public static void backTracking(String words, boolean[] used, int k, int depth,StringBuilder tmp){

        if(k == depth){
            ans.add(tmp.toString());
            return;
        }
       for(int i = 0; i < words.length(); i++){
           used[i] = true;
           tmp.append(words.charAt(i));
           backTracking(words, used,k,depth + 1,tmp);
           tmp.setLength(tmp.length() - 1);
           used[i] = false;
       }
    }

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
