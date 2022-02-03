package Amazon.OA;

import java.util.Arrays;

public class GroupDivision {
    public static void main(String[] args) {
        int[] arr = new int[]{9,3,5,7,1};
        System.out.println(helper(arr,2,1));
    }

    static int helper(int[] skill, int teamSize,int maxDiff){
        Arrays.sort(skill);
        int currindex = 0;
        int result = 0;
        while(currindex + (teamSize -1) < skill.length){ // Terminating condition - no more windows to check
            // if current window satisfied
            if((skill[currindex + teamSize - 1] - skill[currindex]) <= maxDiff){
                result += 1;
                currindex = currindex+teamSize;
            } else {
                // if current window don't satisfied
                currindex++;
            }
        }//End of while

        return result;
    }
}
