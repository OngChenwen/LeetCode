package AlgoExpert;

import java.util.Arrays;
import java.util.Collections;

public class Tandem_Bicycle {
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (!fastest) reverse(redShirtSpeeds);

        int totalSpeed = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[blueShirtSpeeds.length - i - 1]);
        }
        return totalSpeed;
    }

    public void reverse(int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start< end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }

    }
}
