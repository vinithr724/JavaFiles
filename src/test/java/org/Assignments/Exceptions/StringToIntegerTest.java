package org.Assignments.Exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void testExceptionExample_ValidInteger() {
        String expectedOutput = "Converted String to Integer 12";
        assertEquals(expectedOutput, getStringOutput(() -> StringToInteger.exceptionExample("12")));
    }

    @Test
    public void testExceptionExample_InvalidInteger() {
        String expectedOutput = "Input string is not a valid integer: h";
        assertEquals(expectedOutput, getStringOutput(() -> StringToInteger.exceptionExample("h")));
    }

    // Helper method to capture the output of the exceptionExample method
    private String getStringOutput(Runnable method) {
        // Create a new print stream to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the method
        method.run();

        // Return the captured output as a string
        return outContent.toString().trim();
    }
}
