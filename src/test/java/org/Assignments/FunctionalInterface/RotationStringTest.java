package org.Assignments.FunctionalInterface;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotationStringTest {

    @Test
    public void testIsRotation_ValidRotation() {
        assertTrue(RotationString.isRotation("abcd", "cdab"));
    }

    @Test
    public void testIsRotation_InvalidRotation() {
        assertFalse(RotationString.isRotation("abcd", "acbd"));
    }

    @Test
    public void testIsRotation_EmptyString() {
        assertFalse(RotationString.isRotation("", "abcd"));
        assertFalse(RotationString.isRotation("abcd", ""));
        assertFalse(RotationString.isRotation("", ""));
    }

    @Test
    public void testIsRotation_NullString() {
        assertFalse(RotationString.isRotation(null, "abcd"));
        assertFalse(RotationString.isRotation("abcd", null));
        assertFalse(RotationString.isRotation(null, null));
    }

    @Test
    public void testIsRotation_SameString() {
        assertTrue(RotationString.isRotation("abcd", "abcd"));
    }

    @Test
    public void testIsRotation_LongerStrings() {
        assertFalse(RotationString.isRotation("abcd", "abcde"));
        assertFalse(RotationString.isRotation("abcde", "abcd"));
    }

}
