package com.epam.mjc.collections.map;

import java.util.*;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue){
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        // Check if the requiredValue is present among the values of the map
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();

        for (Integer num : sourceList) {
            int value = 5 * num + 2;
            functionMap.put(num, value);
        }

        return functionMap;
    }

    public static void main(String[] args) {
        FunctionValueFinder finder = new FunctionValueFinder();
        List<Integer> sourceList = Arrays.asList(-1, 5, 4, 8);
        int requiredValue = 27;

        boolean result = finder.isFunctionValuePresent(sourceList, requiredValue);
        System.out.println(result); // Output will be "true"
    }
}

