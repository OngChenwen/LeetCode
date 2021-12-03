package Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s){
        Map<String,Integer> dic = new HashMap<>();
        dic.put("I",1);
        dic.put("II",2);
        dic.put("IV",4);
        dic.put("V",5);
        dic.put("X",10);
        dic.put("IX",9);
        dic.put("XL",40);
        dic.put("C",100);
        dic.put("D",500);
        dic.put("M",1000);
        dic.put("XC",90);
        dic.put("CD",400);
        dic.put("CM",900);
        dic.put("L",50);

        int sum = 0;
        int i = 0;
        while(i < s.length()){
            String cur = s.substring(i,i+2);
            if(i < s.length() - 1 && dic.containsKey(cur)){
                    sum += dic.get(cur);
                    i += 2;
            }else {
                String c = s.substring(i, i + 1);
                sum += dic.get(c);
                i += 1;
            }
        }

        return sum;
    }
}
