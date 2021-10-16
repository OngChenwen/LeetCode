package Test;

import java.util.Scanner;

public class Skyway {
    static int x = 0, y = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int ans = findLargestSkyway(matrix);

        System.out.print("The largest skyway is " + ans + " starting at [" + x + "]" + "[" + y +"]" + "\n");

    }

    static int findLargestSkyway(int[][] matrix) {
        int sum,max = 0;
        for(int i = 0; i + 2 < matrix.length; i++) {
            for(int j = 0; j + 3 < matrix.length; j++) {
                sum = matrix[i][j]
                        + matrix[i][j + 3]
                        + matrix[i+1][j]
                        + matrix[i+1][j+1]
                        + matrix[i+1][j+2]
                        + matrix[i+1][j+3]
                        + matrix[i+2][j]
                        + matrix[i+2][j+3];

                if(sum > max) {
                    max = sum;
                    x = i;
                    y = j;
                } else if(sum == max) {
                    if(i < x) {
                        x = i;
                        y =	j;
                    } else if(x == i) {
                        if(j < y) {
                            y = j;
                        }

                    }
                }
            }
        }

        return max;
    }
}
