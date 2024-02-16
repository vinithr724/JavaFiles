package org.Assignments.Exceptions;

public class StringToInteger extends Exception {
    // Method to demonstrate handling a NumberFormatException
    public static void exceptionExample(String s) {
        try {
            // Attempt to convert the input string to an integer
            int si = Integer.parseInt(s);
            // If successful, print the converted integer
            System.out.println("Converted String to Integer " + si);
        } catch (NumberFormatException e) {
            // Catch any NumberFormatException that occurs during parsing
            System.out.println("Input string is not a valid integer: " + s);
        }
    }

    // Main method to demonstrate the usage of exception handling
   /* public static void main(String[] args) throws Exception {
        // Call the exceptionExample method with different input strings
        ExceptionExample.exceptionExample("h");  // This will throw a NumberFormatException
        ExceptionExample.exceptionExample("12"); // This will be successfully converted to an integer
    }*/
}


