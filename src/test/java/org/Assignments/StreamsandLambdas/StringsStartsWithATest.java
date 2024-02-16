package org.Assignments.StreamsandLambdas;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class StringsStartsWithATest {

    @Test
    public void testFilterNamesStartingWithA() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        List<String> expectedFilteredNames = Arrays.asList("Alice");
        List<String> filteredNames = StringsStartsWithA.filterNamesStartingWithA(names);
        assertEquals(expectedFilteredNames, filteredNames);
    }
}
