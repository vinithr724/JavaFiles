package org.Assignments.FunctionalInterface;
public class FactorialFinder {

    public static int findFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        }

        // Base cases for recursion
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Recursive call: factorial(num) = num * factorial(num - 1)
            return num * findFactorial(num - 1);
        }
    }
}

// Explaination:
// public static int findFactorial(int num) {
// This line declares a static method named findFactorial, which takes an integer parameter num
// and returns an integer. The method is responsible for calculating the factorial of the given number.

// if (num < 0) {
//    throw new IllegalArgumentException("Input should be a non-negative integer.");
//}
// This block checks whether the input num is a non-negative integer.
// If num is less than 0, it throws an IllegalArgumentException with an appropriate error message.

//if (num == 0 || num == 1) {
//    return 1;
//}
// These lines define the base cases for the recursion. If num is 0 or 1, the method returns 1.
// This is the termination condition for the recursion.
//
// Recursive Call:
//
// return num * findFactorial(num - 1);
// If num is greater than 1, the method performs a recursive call to itself with the argument num - 1.
// This is based on the mathematical definition of factorial: factorial(num) = num * factorial(num - 1).
