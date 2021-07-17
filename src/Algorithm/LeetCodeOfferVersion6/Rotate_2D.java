package Algorithm.LeetCodeOfferVersion6;

public class Rotate_2D {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int partCol = (int)Math.ceil(n / 2.0);
        int partRow = n / 2;

        for(int i = 0; i < partRow; i++) {
            for (int j = 0; j < partCol; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }

    }
}
