package org.Assignments.FunctionalInterface;

import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class RepeatedCharactersTest {

    @Test
    public void testRepeatedCharacters_NoRepeats() {
        String input = "abcdefg";
        Map<Character, Integer> result = RepeatedCharacters.repeatedCharacters(input);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testRepeatedCharacters_SingleRepeat() {
        String input = "hello";
        Map<Character, Integer> result = RepeatedCharacters.repeatedCharacters(input);
        assertEquals(1, result.size());
        assertTrue(result.containsKey('l'));
        assertEquals(Integer.valueOf(2), result.get('l'));
    }


    @Test
    public void testRepeatedCharacters_EmptyString() {
        String input = "";
        Map<Character, Integer> result = RepeatedCharacters.repeatedCharacters(input);
        assertTrue(result.isEmpty());
    }


}
