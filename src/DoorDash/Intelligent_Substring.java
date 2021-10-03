package DoorDash;

import java.util.*;

public class Intelligent_Substring {

    static int maxNormalSubString(char []P, char []Q,
                                  int K, int N)
    {

        if (K == 0)
            return 0;

        // keeps count of normal characters
        int count = 0;

        // indexes of subString
        int left = 0, right = 0;

        // maintain length of longest subString
        // with at most K normal characters
        int ans = 0;

        while (right < N) {
            // abcde b,d
            while (right < N && count <= K) {

                // get position of character
                int pos = P[right] - 'a';

                // check if current character is normal
                if (Q[pos] == '0') {

                    // check if normal characters
                    // count exceeds K
                    if (count + 1 > K)

                        break;

                    else
                        count++;
                }

                right++;

                // update answer with subString length
                if (count <= K)
                    ans = Math.max(ans, right - left);
            }
            // abcde b,d
            while (left < right) {

                // get position of character
                int pos = P[left] - 'a';

                left++;

                // check if character is
                // normal then decrement count
                if (Q[pos] == '0')

                    count--;

                if (count < K)
                    break;
            }
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        // initialise the String
        // b, d
        String P = "abcde", Q = "10101111111111111111111111";

        int K = 2;

        int N = P.length();

//        System.out.print(maxNormalSubString(P.toCharArray(), Q.toCharArray(), K, N));
        System.out.println(helper(P,K,Q));
    }


    static int helper(String s, int k, String charValue){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < charValue.length(); i++) {
            if(charValue.charAt(i) == '0') set.add((char)('a' + i));
        }

        int left = 0, ans = 0, counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) counter++;
            while (counter > k && left < i){
                if (set.contains(s.charAt(left))) counter--;
                left++;
            }

            ans = Math.max(ans,i - left + 1);
        }

        return ans;
    }
}
