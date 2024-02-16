package org.Assignments.StreamsandLambdas;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {


    // Define a functional interface for math operations
    public interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // 1. Addition using lambda expression
        // Define a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        // Perform addition operation using lambda expression
        System.out.println("Addition: " + addition.operate(3, 4)); // Output: 7

    }
}
