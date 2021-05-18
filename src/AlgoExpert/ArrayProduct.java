package AlgoExpert;

public class ArrayProduct {
    public int[] arrayOfProducts(int[] array) {
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
}

