package org.Assignments.StreamsandLambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringVowelsTest {

    @Test
    public void testStringContainsVowels() {
        // Create a list of strings with and without vowels
        List<String> inputList = Arrays.asList("apple", "banana", "pear", "grape", "xyz");

        // Call the method to filter strings containing vowels
        List<String> result = StringVowels.stringContainsVowels(inputList);

        // Expected output: "apple", "banana", "pear", "grape"
        List<String> expected = Arrays.asList("apple", "banana", "pear", "grape");

        // Assert that the output matches the expected result
        assertEquals(expected, result);
    }

    @Test
    public void testStringContainsVowels_EmptyList() {
        // Create an empty list
        List<String> inputList = Arrays.asList();

        // Call the method to filter strings containing vowels
        List<String> result = StringVowels.stringContainsVowels(inputList);

        // Expected output: empty list (input list is empty)
        List<String> expected = Arrays.asList();

        // Assert that the output matches the expected result
        assertEquals(expected, result);
    }

    @Test
    public void testStringContainsVowels_NoVowels() {
        // Create a list of strings without vowels
        List<String> inputList = Arrays.asList("xyz", "123", "qwr");

        // Call the method to filter strings containing vowels
        List<String> result = StringVowels.stringContainsVowels(inputList);

        // Expected output: empty list (no strings contain vowels)
        List<String> expected = Arrays.asList();

        // Assert that the output matches the expected result
        assertEquals(expected, result);
    }
}
