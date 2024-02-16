package org.Assignments.StreamsandLambdas;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StringCapitalizeTest {

    @Test
    public void testCapitalizeFirstLetter() {
        String[] inputArray = {"apple", "banana", "cherry"};
        String[] expectedArray = {"Apple", "Banana", "Cherry"};
        String[] resultArray = StringCapitalize.capitalizeFirstLetter(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }
}

