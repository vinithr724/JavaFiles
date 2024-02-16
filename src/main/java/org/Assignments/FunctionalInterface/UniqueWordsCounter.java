package org.Assignments.FunctionalInterface;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsCounter {

   /* public static void main(String[] args) {
        String text = "This is a test text with some test words and some unique words";
        int uniqueWordCount = countUniqueWords(text);
        System.out.println("Number of unique words: " + uniqueWordCount);
    }*/

    public static int countUniqueWords(String text) {
        // Split the text into individual words
        String[] words = text.toLowerCase().split("\\s+");

        // Create a Set to efficiently store unique words
        Set<String> uniqueWords = new HashSet<>();

        // Add each word to the Set (duplicates will be ignored)
        for (String word : words) {
            uniqueWords.add(word);
        }

        // The size of the Set represents the number of unique words
        return uniqueWords.size();
    }
}

