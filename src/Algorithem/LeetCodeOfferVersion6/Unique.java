package Algorithem.LeetCodeOfferVersion6;

public class Unique {
    public boolean isUnique(String astr) {
        //no additional data structure used
        for (int i = 0; i < astr.length() - 1; i++) {
            //最后一次出现位置不等于现在的 false -> 其他位置存在 相同 字符
            if (astr.lastIndexOf(astr.charAt(i)) != i) return false;
        }

        return true;
    }
}
