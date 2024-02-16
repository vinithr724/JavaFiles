package org.Assignments.StreamsandLambdas;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SquaresOfPositiveNumberTest {

    @Test
    public void testSumOfSquaresOfPositive() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double expectedSum = 1 + 4 + 9 + 16 + 25; // 1^2 + 2^2 + 3^2 + 4^2 + 5^2
        double result = SquaresOfPositiveNumber.sumOfSquaresOfPositive(list);
        assertEquals(expectedSum, result, 0.001); // Specify a delta for double comparison
    }

    @Test
    public void testSumOfSquaresOfPositive_EmptyList() {
        List<Integer> list = Arrays.asList();
        double result = SquaresOfPositiveNumber.sumOfSquaresOfPositive(list);
        assertEquals(0.0, result, 0.001); // For an empty list, sum should be 0
    }

    @Test
    public void testSumOfSquaresOfPositive_NoPositiveNumbers() {
        List<Integer> list = Arrays.asList(-1, -2, -3, -4, -5);
        double result = SquaresOfPositiveNumber.sumOfSquaresOfPositive(list);
        assertEquals(0.0, result, 0.001); // For a list with no positive numbers, sum should be 0
    }

}
