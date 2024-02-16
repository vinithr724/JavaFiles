package org.Assignments.FunctionalInterface;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome_PositivePalindrome() {
        assertTrue(Palindrome.isPalindrome(121));
    }

    @Test
    public void testIsPalindrome_PositiveNonPalindrome() {
        assertFalse(Palindrome.isPalindrome(123));
    }

    @Test
    public void testIsPalindrome_NegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }

    @Test
    public void testIsPalindrome_SingleDigitNumber() {
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(1));
        assertTrue(Palindrome.isPalindrome(9));
    }

    @Test
    public void testIsPalindrome_LargePalindrome() {
        assertTrue(Palindrome.isPalindrome(123454321));
    }

    @Test
    public void testIsPalindrome_LargeNonPalindrome() {
        assertFalse(Palindrome.isPalindrome(123456789));
    }
}
