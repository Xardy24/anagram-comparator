package anagram.service;

import java.util.*;

public class AnagramComparator {
    private final Map<String, List<String>> anagramsMap;

    public AnagramComparator() {
        // Initialize the map to store anagrams, where the key is the sorted string and the value is a list of anagrams.
        anagramsMap = new HashMap<>();
    }

    // Helper function to sort a string alphabetically
    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Feature #1: Check if two texts are anagrams of each other
    public boolean areAnagrams(String text1, String text2) {
        String sortedText1 = sortString(text1.toLowerCase());
        String sortedText2 = sortString(text2.toLowerCase());
        return sortedText1.equals(sortedText2);
    }

    // Feature #2: Find all anagrams for a given text
    public List<String> findAllAnagrams(String text) {
        String sortedText = sortString(text.toLowerCase());
        List<String> anagrams = anagramsMap.getOrDefault(sortedText, new ArrayList<>());

        // Create a new list that excludes the original text
        List<String> resultAnagrams = new ArrayList<>(anagrams);
        resultAnagrams.remove(text);

        return resultAnagrams;
    }


    // Feature #2: Add a text to the map of anagrams
    public void addString(String text) {
        String sortedText = sortString(text.toLowerCase());
        List<String> anagrams = anagramsMap.getOrDefault(sortedText, new ArrayList<>());
        anagrams.add(text);
        anagramsMap.put(sortedText, anagrams);
    }
}

