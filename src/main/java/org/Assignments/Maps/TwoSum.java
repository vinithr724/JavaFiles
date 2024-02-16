package org.Assignments.Maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Method to find indices of two numbers in the array that sum up to the target
    public static int[] findTwoSumIndices(int[] nums, int target) {
        // Create a HashMap to store the indices of the numbers
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement exists in the map (i.e., if we have found a pair of numbers that sum up to the target)
            if (numIndexMap.containsKey(complement)) {
                // Return the indices of the two numbers that sum up to the target
                // Index of the complement (previously encountered number) is retrieved from the map
                // Index of the current number is 'i'
                return new int[]{numIndexMap.get(complement), i};
            }

            // Store the current number along with its index in the map
            numIndexMap.put(nums[i], i);
        }

        // If no such pair is found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
