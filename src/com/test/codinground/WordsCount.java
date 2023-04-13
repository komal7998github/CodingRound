package com.test.codinground;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
	public static void main(String[] args) {
        String inputString = "This is a test example for test purpose";
        Map<String, Integer> wordCounts = countWords(inputString);
        System.out.println("Input String: \"" + inputString + "\"");
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String inputString) {
        // Split the inputString by whitespace to get individual words
        String[] words = inputString.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // If word already exists in wordCounts, increment its count
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If word does not exist in wordCounts, add it with count 1
                wordCounts.put(word, 1);
            }
        }
        return wordCounts;
    }
}