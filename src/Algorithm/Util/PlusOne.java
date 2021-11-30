package Algorithm.Util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Plus one from array
 */
public class PlusOne {
    static List<Integer> helper(List<Integer> arr){
        int n = arr.size();
        for (int i = n - 1; i >=0 ; i--) {
            if(arr.get(i) == 9){
                arr.set(i,0);
            } else {
                arr.set(i,arr.get(i) + 1);
                return arr;
            }
        }
        //1-> 5 -> 7
        arr.add(0,1);
        return arr;
    }
}


