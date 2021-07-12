package AlgoExpert.Arrays;

import java.util.Arrays;

public class ArrayProduct {
    // brute force
    public static int[] arrayOfProducts_1(int[] array) {
        // Write your code here.
        int[] products = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) product *= array[j];

                products[i] = product;
            }
        }
        return products;
    }

    //Two Pointers, left hand side product
    // right hand side product
    public static int[] arrayOfProducts_2(int[] array){
        int[] product_left_array = new int[array.length];
        int[] product_right_array = new int[array.length];

        int product_left = 1;
        for (int left = 0; left < array.length; left++){
            product_left_array[left] = product_left;
            product_left *= array[left];
        }

        int product_right = 1;
        for (int i = array.length -1; i >= 0 ; i--) {
            product_right_array[i] = product_right;
            product_right *= array[i];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = product_left_array[i] * product_right_array[i];
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,1,4,2};
        System.out.println(Arrays.toString(arrayOfProducts_1(array)));
    }

}

