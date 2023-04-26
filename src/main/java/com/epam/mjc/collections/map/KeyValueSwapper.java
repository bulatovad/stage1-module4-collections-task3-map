package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new HashMap<>();

        for(Map.Entry<Integer, String> e: sourceMap.entrySet()) {
            String newKey = e.getValue();
            int newValue = e.getKey();
            if(swapped.containsKey(newKey)) {
                if(newValue < swapped.get(newKey)) {
                    swapped.replace(newKey, newValue);
                }
            } else {
                swapped.put(newKey, newValue);
            }
        }
        return swapped;
    }
}
