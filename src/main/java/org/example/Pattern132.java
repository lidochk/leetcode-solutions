package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

//task 456 https://leetcode.com/problems/132-pattern/
public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        int length = nums.length;

        // Check if the array has less than 3 elements
        if (length < 3)
            return false;

        // Stack to keep track of decreasing elements.
        Deque<Integer> decreasingStack = new ArrayDeque<>(length);

        // Maximum value of the third element in the 132 pattern.
        int maxThirdElement = Integer.MIN_VALUE;

        // Traverse the array from right to left
        for (int i = length - 1; i >= 0; i--) {
            int currentNumber = nums[i];

            // Check for 132 pattern
            if (currentNumber < maxThirdElement)
                return true;  // Found a 132 pattern.

            // Maintain the stack with decreasing elements
            while (!decreasingStack.isEmpty() && decreasingStack.peek() < currentNumber) {
                maxThirdElement = decreasingStack.pop();
            }

            // Push the current element onto the stack.
            decreasingStack.push(currentNumber);
        }

        return false; // No 132 pattern found
    }

    public static void main(String[] args) {
        Pattern132 pattern132 = new Pattern132();
        int[] inputArray = {1, 3, 2, 4, 5};
        System.out.println(pattern132.find132pattern(inputArray));
    }
}
