package org.Assignments.FunctionalInterface;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be palindromes
        }

        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number efficiently using a loop
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

// Explaination of the code :
// if (number < 0) { return false; }: This line checks if the input number is negative.
// If it is, the function immediately returns false because negative numbers cannot be palindromes.
// int reversedNumber = 0;: This line creates a variable reversedNumber to store the reversed version of the input
// number,starting with 0.
// int originalNumber = number;: This line stores the original number in a separate variable originalNumber
// to compare it with the reversed number later.
// while (number != 0) { ... }: This while loop continues as long as the number is not 0.
// It's used to reverse the digits of the number efficiently.
// reversedNumber = reversedNumber * 10 + number % 10;: Inside the loop, this line performs two key actions:
// It shifts the digits in reversedNumber one position to the left by multiplying it by 10.
// It extracts the last digit of the number using the modulo operator (%) and adds it to the reversedNumber.
// This effectively builds the reversed number digit by digit.
// number /= 10;: This line removes the last digit from the number by dividing it by 10.
// This prepares for the next iteration of the loop.
// return originalNumber == reversedNumber;: After the loop completes, this line compares the originalNumber
// with the reversedNumber. If they are equal, it means the number is a palindrome, so the function returns true.
// Otherwise, it returns false.
