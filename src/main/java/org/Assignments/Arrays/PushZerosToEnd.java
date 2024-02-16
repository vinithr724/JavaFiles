package org.Assignments.Arrays;

public class PushZerosToEnd {

    public static void pushZerosToEnd(int[] arr) {
        int j = 0; // Index to store non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i]; // Swap current element with non-zero element
                j++; // Increment non-zero element index
            }
        }
        // Fill remaining elements with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 5, 4, 0, 2, 2};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}