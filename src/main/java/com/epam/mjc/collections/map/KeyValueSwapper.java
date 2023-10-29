package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        // Create a TreeMap to ensure sorted keys
        Map<String, Integer> swappedMap = new TreeMap<>();

        // Iterate through the source map entries
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            // Check if the value already exists in the swapped map
            if (!swappedMap.containsKey(value)) {
                swappedMap.put(value, key);
            } else {
                // If the value already exists, check if the new key is smaller
                int existingKey = swappedMap.get(value);
                if (key < existingKey) {
                    swappedMap.put(value, key);
                }
            }
        }

        return swappedMap;
    }

    public static void main(String[] args) {
        KeyValueSwapper swapper = new KeyValueSwapper();
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "one");
        sourceMap.put(2, "two");
        sourceMap.put(3, "three");
        sourceMap.put(10, "one");

        Map<String, Integer> swappedMap = swapper.swap(sourceMap);

        // Print the result
        for (Map.Entry<String, Integer> entry : swappedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

