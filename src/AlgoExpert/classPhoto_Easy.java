package AlgoExpert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class classPhoto_Easy {
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights, Collections.reverseOrder());
    Collections.sort(blueShirtHeights, Collections.reverseOrder());
    String firstRow = "";
    if(redShirtHeights.get(0) < blueShirtHeights.get(0)){
         firstRow = "R";
    } else {
         firstRow = "B";
    }

        for (int i = 0; i < redShirtHeights.size() ; i++) {
            if (firstRow.equals("R")){
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i)) return false;
            } else {
                if (blueShirtHeights.get(i) >= redShirtHeights.get(i)) return false;
            }
        }

        return false;
    }
}
