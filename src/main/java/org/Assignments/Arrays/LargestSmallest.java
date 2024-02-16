package org.Assignments.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {
        int[] arr = {34, 56, 12, 11, 45, 67, 78, 43, 323, 34, 43};

        // Initialize variables to the first element of the array
        int smallest = arr[0];
        int largest = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update smallest if the current element is smaller
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            // Update largest if the current element is larger
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}