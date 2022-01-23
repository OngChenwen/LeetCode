package Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Priority {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,8,4};
        System.out.println(Arrays.toString(helper1(arr)));
    }
    // O(nlogn)-> sort
    static int[] helper(int[] num){
        int[] arr = Arrays.copyOf(num,num.length);
        Map<Integer,Integer> dic = new HashMap<>();
        int priority = 1;
        Arrays.sort(arr);
        for (int n: arr) {
            if(dic.containsKey(n)){
                continue;
            }
            dic.put(n,priority);
            priority++;
        }

        for(int i = 0; i < num.length;i++){
            num[i] = dic.get(num[i]);
        }

        return num;
    }

    // O(n)

    static int[] helper1(int[] arr){
        int[] counts = new int[100];
        for (int n : arr){
            counts[n]++;
        }

        int priority = 1;

        for(int i = 1; i < counts.length;i++){
            if(counts[i] > 0){
                counts[i] = priority;
                priority++;
            }
        }

        for(int i = 0; i< arr.length;i++){
            arr[i] = counts[arr[i]];
        }

        return arr;
    }
}
