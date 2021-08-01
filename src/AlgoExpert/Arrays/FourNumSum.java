package AlgoExpert.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourNumSum {
    static List<List<Integer>> solution(int[] numbers, int target){
        Arrays.sort(numbers);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if(i>0 && numbers[i-1] == numbers[i]) continue;
            for (int j = i+1; j < numbers.length; j++) {
                if (j> i +1 && numbers[j-1] == numbers[j]) continue;
                int left = j + 1,right = numbers.length -1;
                while (left < right){
                    int sum = numbers[i] + numbers[j] + numbers[left] + numbers[right];
                    if (sum == target){
                        ans.add(Arrays.asList(numbers[i] , numbers[j] , numbers[left] , numbers[right]));
                        while (left< right && numbers[left] == numbers[left+1]) left++;
                        while (left<right && numbers[right] == numbers[right -1]) right--;
                        left++;
                        right--;
                    }else if (sum >target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,3,1,2,-6,5,-8,6};
        List<List<Integer>> integers = solution(array, 0);
        for (List<Integer> value : integers) {
            System.out.println(value.toString());
        }
    }
}
