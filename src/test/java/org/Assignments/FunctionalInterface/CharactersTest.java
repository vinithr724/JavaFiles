package org.Assignments.FunctionalInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class CharactersTest {

    @Test
    public void testIdentifyAndPrintRepeatedWithNonNullInput() {
        // Test the method with a non-null input string
        Set<Character> expectedRepeatedCharacters = new HashSet<>();
        expectedRepeatedCharacters.add('a');
        expectedRepeatedCharacters.add('b');
        expectedRepeatedCharacters.add('c');

        String input = "abcaabbcc";
        Set<Character> actualRepeatedCharacters = new HashSet<>();
        Characters.identifyAndPrintRepeated(input);

        assertEquals(expectedRepeatedCharacters, actualRepeatedCharacters);
    }

    @Test
    public void testIdentifyAndPrintRepeatedWithNullInput() {
        // Test the method with a null input string
        assertThrows(IllegalArgumentException.class, () -> Characters.identifyAndPrintRepeated(null));
    }
}
