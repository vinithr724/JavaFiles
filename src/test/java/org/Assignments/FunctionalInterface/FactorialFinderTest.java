package org.Assignments.FunctionalInterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialFinderTest {

    @Test
    public void testFindFactorialWithPositiveNumber() {
        // Test the factorial of a positive number
        assertEquals(120, FactorialFinder.findFactorial(5));
    }

    @Test
    public void testFindFactorialWithZero() {
        // Test the factorial of 0
        assertEquals(1, FactorialFinder.findFactorial(0));
    }

    @Test
    public void testFindFactorialWithNegativeNumber() {
        // Test for IllegalArgumentException when a negative number is passed
        assertThrows(IllegalArgumentException.class, () -> FactorialFinder.findFactorial(-5));
    }

    @Test
    public void testFindFactorialWithOne() {
        // Test the factorial of 1
        assertEquals(1, FactorialFinder.findFactorial(1));
    }
}
