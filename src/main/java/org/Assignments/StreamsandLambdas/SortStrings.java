package org.Assignments.StreamsandLambdas;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {

    // Method to sort an array of strings based on their lengths
    public static String[] sortBasedOnLength(String[] array) {
        // Convert the array into a stream of strings
        return Arrays.stream(array)
                // Sort the stream based on the lengths of the strings
                .sorted(Comparator.comparingInt(String::length))
                // Convert the sorted stream back into an array of strings
                .toArray(String[]::new);
    }
}

// Explaination of Code:
// String[] strings = {"apple", "banana", "cherry", "date", "mango", "orange"};: Creates an array of strings
// to be sorted.
//Arrays.stream(strings): Converts the array of strings into a stream, enabling operations on its elements
// sequentially.
//.sorted(Comparator.comparingInt(String::length).thenComparing(...)): Sorts the stream using a multi-level
// comparator:
//First Level: Comparator.comparingInt(String::length) compares strings based on their lengths in ascending order.
//Second Level: .thenComparing(s -> ((String) s).charAt(s.length() - 1)).reversed() compares the last characters
//of strings in descending order, but only if their lengths are equal.
//The explicit cast to String ensures the compiler can find the length() method.
//.forEach(System.out::println): Prints each sorted string to the console.