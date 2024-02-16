package org.Assignments.Strings;

public class ReverseWords {

    // Method to reverse the order of words in a string
    public static String reverseWord(String str) {
        if (str == null) return null; // Handle null input

        // Split the input string into words using whitespace as delimiter
        String[] words = str.trim().split("\\s+");

        // Create a StringBuilder to efficiently build the reversed string
        StringBuilder reverseWord = new StringBuilder();

        // Iterate through each word in the words array
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the result StringBuilder in reverse order
            reverseWord.append(words[i]);

            // Append a space after each word, except for the last word
            if (i > 0) {
                reverseWord.append(" ");
            }
        }

        // Convert the StringBuilder to a String and return it
        return reverseWord.toString();
    }
}
