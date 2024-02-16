package org.Assignments.StreamsandLambdas;
import java.util.List;

public class SquaresOfPositiveNumber {
    public static Double sumOfSquaresOfPositive(List<Integer> li) {
        // Using streams and lambdas to calculate the sum of squares of positive numbers
        return li.stream()
                .filter(s -> s > 0)        // Filter positive numbers
                .mapToDouble(s -> Math.pow(s, 2))  // Square each positive number
                .sum();                    // Calculate the sum
    }
}

