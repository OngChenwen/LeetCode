package Algorithem;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int maxValue = 0;

        for(int i=0;i<candies.length;i++){
            if(maxValue<candies[i])
                maxValue = candies[i];
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxValue)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }

    }


