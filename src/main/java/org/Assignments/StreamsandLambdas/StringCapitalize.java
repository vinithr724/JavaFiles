package org.Assignments.StreamsandLambdas;

import java.util.Arrays;
public class StringCapitalize {
    public static String[] capitalizeFirstLetter(String[] s) {
        // Check if the input array is null
        if (s == null) {
            // If it is null, return null
            return s;
        }

        // Create a new array to store the capitalized strings
        String[] capitalizedArray = new String[s.length];

        // Loop through each string in the input array
        for (int i = 0; i < s.length; i++) {
            // Create a StringBuilder from the current string
            StringBuilder sb = new StringBuilder(s[i]);
            // Capitalize the first character of the string
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            // Store the capitalized string in the new array
            capitalizedArray[i] = sb.toString();
        }

        // Sort the array of capitalized strings in alphabetical order
        Arrays.sort(capitalizedArray);

        // Return the sorted array of capitalized strings
        return capitalizedArray;
    }
}
