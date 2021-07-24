package leetCode.Array.Date_07_24;

public class Leet_9_isPalindrome {
    public boolean solution(int x){
        String number = String.valueOf(x);
        int left = 0, right = number.length() - 1;
        while (left < right){
            if (number.charAt(left) != number.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}
