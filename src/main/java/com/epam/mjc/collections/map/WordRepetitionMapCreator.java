package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        // Convert the entire sentence to lowercase
        sentence = sentence.toLowerCase();

        // Tokenize the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a Map to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Iterate through the words and update the frequency count
        for (String word : words) {
            // Remove any punctuation (if needed)
            word = word.replaceAll("[^a-zA-Z]", ""); // This will remove non-alphabetic characters

            if (!word.isEmpty()) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequencyMap;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator creator = new WordRepetitionMapCreator();
        String sentence = "sentense in loWER caSE, SENTENCE IN UPper CAse.";
        Map<String, Integer> wordRepetitionMap = creator.createWordRepetitionMap(sentence);

        // Print the result
        for (Map.Entry<String, Integer> entry : wordRepetitionMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

