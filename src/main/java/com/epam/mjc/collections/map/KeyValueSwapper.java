package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        List<Integer> keys = new ArrayList<>(sourceMap.keySet());
        List<String> values = new ArrayList<>(sourceMap.values());
        Map<String, Integer> swaped = new HashMap<>();

        for (int i = 0; i < sourceMap.size(); i++) {
            swaped.put(values.get(i), keys.get(i));
        }

        return swaped;
    }
}
