package org.Assignments.Arrays;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] intArray = {25, 45, 15, 65, 11, 68, 75, 85, 9, 71, 84, 34, 96, 80};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(intArray));

        // Sort the array using the bubble sort algorithm
        bubbleSort(intArray);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // Flag to check if any swaps occurred in the inner loop

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if not in order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set flag to indicate a swap occurred
                }
            }

            // If no swaps occurred in the inner loop, the array is already sorted
            if (!swapped) {
                break; // Early termination if no swaps needed
            }
        }
    }
}