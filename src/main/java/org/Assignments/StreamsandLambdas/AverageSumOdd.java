package org.Assignments.StreamsandLambdas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AverageSumOdd {

    public static double avgSquares(int[] arr) {
        // Create an IntStream from the array
        IntStream st = Arrays.stream(arr);

        // Calculate the sum of squares of odd numbers
        int sum = st.filter(num -> num % 2 != 0).map(num -> num * num).sum();

        // Create another IntStream from the array
        IntStream st1 = Arrays.stream(arr);

        // Count the number of odd numbers
        int count = (int) st1.filter(num -> num % 2 != 0).count();

        // Calculate the average by dividing the sum by the count
        return count == 0 ? 0 : (double) sum / count;
    }
}

/*   public static void main(String[] args) {
        // Test cases
        System.out.println(AverageSumOdd.avgSquares(new int[]{1, 1, 1, 1, 3}));
        System.out.println(AverageSumOdd.avgSquares(new int[]{1, 2, 3, 4, 5, 6, 7, 9, 3, 1}));
    }
}*/
//
// Explaination of code :
//The avgSquares method takes an array of integers as input and calculates
//the average of the squares of all odd numbers in the array.
//It creates an IntStream from the input array using Arrays.stream(arr).
//Using the first IntStream, it filters out odd numbers (num % 2 != 0),
//squares each odd number, and then calculates their sum.
//It creates another IntStream from the input array to count the number of odd numbers.
//The count of odd numbers is obtained by filtering the array with the condition num % 2 != 0
//and then counting the elements.
//The average is calculated by dividing the sum of squares by the count.
//If the count is zero (indicating there are no odd numbers), it returns 0 to avoid division by zero.
//In the main method, test cases are provided to demonstrate the functionality of the avgSquares method.
