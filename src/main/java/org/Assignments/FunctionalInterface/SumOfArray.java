package org.Assignments.FunctionalInterface;

public class SumOfArray {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        // Loop through the array to calculate sum of elements using enhanced for loop
        for (int num : arr) {
            sum += num;
        }

        // Print the sum of all the elements of the array
        System.out.println("Sum of all the elements of the array: " + sum);
    }
}
