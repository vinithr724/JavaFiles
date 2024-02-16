package org.Assignments.loops;

public class ReverseNumber {
    public static void main(String[] args) {
        // Initialize the original number
        int num = 12345;
        // Initialize the variable to store the reversed number
        int reversed = 0;
        // Loop until the original number becomes 0
        while (num != 0) {
            // Extract the last digit of the original number
            int digit = num % 10;
            // Append the last digit to the reversed number, shifting its digits to the left
            // For example, if the reversed number is 0 and the extracted digit is 4,
            // it becomes 4; if the reversed number is 40 and the extracted digit is 3,
            // it becomes 43, and so on
            reversed = reversed * 10 + digit;
            // Remove the last digit from the original number
            num /= 10;
        }
        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}
