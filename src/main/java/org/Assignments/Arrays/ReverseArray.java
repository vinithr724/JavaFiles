package org.Assignments.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = {34, 56, 12, 11, 45, 67, 78, 43, 323, 34, 43};

        // Iterate through half of the array
        for (int i = 0; i < arr.length / 2; i++) {
            // Swap elements at position i with arr.length-1-i
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
