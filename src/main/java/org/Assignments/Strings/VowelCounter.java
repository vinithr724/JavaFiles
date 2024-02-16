package org.Assignments.Strings;

public class VowelCounter {

    // Define a method that takes a string as a parameter
    public static int countVowels(String string) {
        // Initialize a variable to store the vowel count
        int vowelCount = 0;

        // Define a set of vowels for efficient lookup
        String vowels = "aeiouAEIOU";

        // Loop through each character in the string
        for (int i = 0; i < string.length(); i++) {
            // Get the current character
            char c = string.charAt(i);
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                // Increment the vowel count by one
                vowelCount++;
            }
        }
        // Return the vowel count
        return vowelCount;
    }
}
    // Test the method with some examples
   /* public static void main(String[] args) {
        System.out.println(countVowels("Hello"));
        System.out.println(countVowels("world"));
        System.out.println(countVowels("Java"));
    }
}*/
