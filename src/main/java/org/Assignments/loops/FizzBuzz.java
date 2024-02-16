package org.Assignments.loops;

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                // If divisible by both 3 and 5, print "FizzBuzz"
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3 only
            else if (i % 3 == 0) {
                // If divisible by 3 only, print "Fizz"
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5 only
            else if (i % 5 == 0) {
                // If divisible by 5 only, print "Buzz"
                System.out.println("Buzz");
            }
            // If the number is not divisible by either 3 or 5,
            // print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
