package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    //Two Pointers
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove){
        int left = 0 ,right = array.size() - 1;
        // while toMove element at right, just scale back the range of list which need to be swap.
        while (left< right){
            // right hand side with toMove element, no action , just move left
            while (left < right && array.get(right) == toMove){
                right--;
            }
            // if left == toMove, use Swap function swap two elements.
            if(array.get(left) == toMove ){
                swap(left,right,array);
            }
            left++;

        }

        return array;
    }

    public static void swap(int i, int j, List<Integer> array){
        int temp = array.get(i);
        array.set(i,array.get(j));
        array.set(j,temp);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        System.out.println(moveElementToEnd(list,2));
    }
}
