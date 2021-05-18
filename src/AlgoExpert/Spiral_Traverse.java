package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Traverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int startCol = 0;
        int endCol = array[0].length-1;
        int startRow = 0;
        int endRow = array.length-1;
        List<Integer> result = new ArrayList<>();



        while (startCol <=endCol && startRow <= endRow){
            for (int i = startCol; i <= endCol; i++) {
                result.add(array[startRow][i]);
            }
            startRow++;
            for (int i = startRow; i <= endRow ; i++) {
                result.add(array[i][endCol]);
            }
            endCol--;
            for (int i = endCol; i >= startCol ; i--) {
                result.add(array[endRow][i]);
            }
            endRow--;

            for (int i = endRow; i >= startRow; i--) {
                result.add(array[i][startCol]);
            }
            startCol++;
        }
        return result;
    }
}
