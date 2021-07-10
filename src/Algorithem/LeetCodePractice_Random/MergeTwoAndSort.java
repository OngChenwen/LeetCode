package Algorithem.LeetCodePractice_Random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoAndSort {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = nums1.length + nums2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : nums1) {
            result[pos] = element;
            pos++;
        }

        for (int element : nums2) {
            result[pos] = element;
            pos++;
        }

        Arrays.sort(result);


    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3},3, new int[]{2,5,6},3);
    }
}
