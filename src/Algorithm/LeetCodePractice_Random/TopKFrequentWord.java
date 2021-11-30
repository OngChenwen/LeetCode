package Algorithm.LeetCodePractice_Random;

import java.util.*;

public class TopKFrequentWord {
    public List<String> topFreWord(String[] words, int k){
        Map<String,Integer> dic = new HashMap<>();
        for(String s : words){
            dic.put(s,dic.getOrDefault(s,0) + 1);
        }

        List<String> res = new ArrayList<>(dic.keySet());

        res.sort((o1, o2) -> Objects.equals(dic.get(o1), dic.get(o2)) ? o1.compareTo(o2) : dic.get(o2) - dic.get(o1));

        return res.subList(0,k);

    }
}
