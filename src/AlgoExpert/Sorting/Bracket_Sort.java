package AlgoExpert.Sorting;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bracket_Sort {
    public static void main(String[] args) {
        int[] array = {72,6,57,88,60,42,83,73,48,85};
        System.out.println(Arrays.toString(array));

        System.out.println("- - - - -");
        bracket_sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bracket_sort(int[] num){
        // defined number of brackets
        int size = 10;
        List<List<Integer>> bracketList = new ArrayList<>();
        // create brackets
        for (int i = 0; i < size; i++) {
            bracketList.add(new ArrayList<>());
        }
        // according to the size, 根据十位或百位进行分组
        for (int i = 0; i < num.length; i++) {
            bracketList.get(mapping(num[i],size)).add(num[i]);
        }
        // sort each bracket
        for (List<Integer> list : bracketList) {
            if(list.size() > 1){
                Collections.sort(list);
            }
        }
        // re-input the sorted brackets into original array
        int j = 0;
        for (List<Integer> list: bracketList) {
            if(list.size() > 0){
                for (Integer integer : list) {
                    num[j] = integer;
                    j++;
                }
            }

        }
    }

    public static int mapping(int num, int size){
        return num/size;
    }

}


