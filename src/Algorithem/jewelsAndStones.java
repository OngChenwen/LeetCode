package Algorithem;

public class jewelsAndStones {
    public int numJewelsInStones(String jewels, String stones){
        int counter = 0;

        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (int i = 0; i < jewelsArray.length ; i++) {
            for (int j = 0; j < stonesArray.length; j++) {
                if (stonesArray[j] == jewelsArray[i]){
                    counter++;
                }
            }
        }
        return counter;

    }
}
