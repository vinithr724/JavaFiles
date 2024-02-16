package org.Assignments.Maps;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void testFindTwoSumIndices() {

        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] resultIndices = TwoSum.findTwoSumIndices(nums, target);

        assertArrayEquals("Indices should be [3, 5]", new int[]{3, 5}, resultIndices);
    }

    @Test
    public void testFindTwoSumIndicesWithNoSolution() {

        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 200;

        int[] resultIndices = TwoSum.findTwoSumIndices(nums, target);

        assertArrayEquals("No solution, indices should be [-1, -1]",new int[]{-1, -1}, resultIndices);
    }
}