package org.Assignments.StreamsandLambdas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AverageSumOddTest {
    @Test
    public void testAvgSquares_NoOddNumbers() {
        int[] arr = {2, 4, 6, 8};
        double expectedAverage = 0.0; // No odd numbers, so average is 0
        double result = AverageSumOdd.avgSquares(arr);
        assertEquals(expectedAverage, result, 0.0001); // Specify a delta for double comparison
    }
}
