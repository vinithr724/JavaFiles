package org.Assignments.FunctionalInterface;

import java.util.HashSet;
import java.util.Set;

public class Characters {

    public static void identifyAndPrintRepeated(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        Set<Character> seenCharacters = new HashSet<>();
        Set<Character> repeatedCharacters = new HashSet<>();

        for (char character : input.toCharArray()) {
            // Convert char to Character using Character.valueOf(char)
            Character charObject = Character.valueOf(character);

            if (seenCharacters.contains(charObject)) {
                repeatedCharacters.add(charObject);
            } else {
                seenCharacters.add(charObject);
            }
        }

        System.out.println("Repeated characters in the string:");
        for (Character repeatedCharacter : repeatedCharacters) {
            System.out.print(repeatedCharacter + " ");
        }
    }
}



// Explaination of the code :
// import java.util.HashSet;: This line imports the HashSet class,
// which is a collection that stores unique elements without any specific order.
// import java.util.Set;: This line imports the Set interface,
// which is a general interface for collections that don't allow duplicates.
// public class Characters { ... }: This line defines a class called Characters to hold the methods
// related to character manipulation.
// public static void identifyAndPrintRepeated(String input) { ... }: This line defines a static method
// called identifyAndPrintRepeated that takes a String input and identifies the repeated characters within it.
// if (input == null) { ... }: This line checks if the input string is null.
// If it is, the method throws an IllegalArgumentException to prevent errors.
// Set<Character> seenCharacters = new HashSet<>();: This line creates a HashSet called seenCharacters
// to keep track of the characters that have already been encountered in the input string.
// Set<Character> repeatedCharacters = new HashSet<>();: This line creates another HashSet called repeatedCharacters
// to store the characters that have been encountered more than once.
// for (char character : input.toCharArray()) { ... }: This for loop iterates through each character in the input
// string by converting it to a character array using toCharArray().
// Character charObject = Character.valueOf(character);: This line converts the primitive char type to a Character
// object, which is required for storing characters in sets.
// if (seenCharacters.contains(charObject)) { ... }: This line checks if the current character has already been
// seen before. If it has, it means it's a repeated character.
// repeatedCharacters.add(charObject);: If the character is repeated, it's added to the repeatedCharacters set.
// else { seenCharacters.add(charObject); }: If the character is not yet seen, it's added to the seenCharacters set
// to mark it as encountered.
// System.out.println("Repeated characters in the string:");: This line prints a heading for the output.
// for (Character repeatedCharacter : repeatedCharacters) { ... }: This loop iterates through the repeatedCharacters
// set and prints each repeated character to the console.