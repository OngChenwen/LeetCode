package AlgoExpert.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ValidateSubsequence {
    // Two Pointers
    public static boolean isValidateSubsequence(List<Integer> array,List<Integer> sequence){
        int pointer_Array =0, pointer_sequence = 0;

        while (pointer_Array != array.size() && pointer_sequence != sequence.size()){
            // if get same value for both list, sequence list move index of pointers
            if (array.get(pointer_Array).equals(sequence.get(pointer_sequence))){
                pointer_sequence ++;
            }

            pointer_Array++;
        }
        // if it has same sequence list, the sequence pointer should at the end of sequence list
        // in other words, the value should be as same as sequence list size.
        return sequence.size() == pointer_sequence;
    }

    public static void main(String[] args) {
        System.out.println(isValidateSubsequence(Arrays.asList(5,1,22,25,6,-1,8,10), Arrays.asList(1,6,-1,10)));
    }
}
