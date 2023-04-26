package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wr = new TreeMap<>();

        for(String word : sentence.toLowerCase().split("\\W")) {
            if(word.equals("")) continue;
            else if(!wr.containsKey(word)) {
                wr.put(word, 1);
            } else {
                int value = wr.get(word);
                wr.replace(word, value+1);
            }
        }

        return wr;
    }
}
