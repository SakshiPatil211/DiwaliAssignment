package Test;
import java.util.*;
public class FindMissingNumber {

    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        
        // 1. Calculate the expected sum of numbers from 0 to n using the formula: n * (n + 1) / 2
        // We use 'long' for the sum calculation to safely handle potential integer overflow 
        // when n is large (e.g., close to 2^31).
        long expectedSum = (long)n * (n + 1) / 2;
        
        // 2. Calculate the actual sum of the numbers present in the array.
        long actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // 3. The difference is the missing number.
        // The result is cast back to 'int' since the missing number itself must be within the int range.
        return (int)(expectedSum - actualSum);
    }

    /**
     * Main method to demonstrate the functionality.
     */
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        // Test Case 1: Array {3, 0, 1}. n=3. Expected numbers: 0, 1, 2, 3. Missing is 2.
        int[] arr1 = {3, 0, 1};
        int missing1 = solution.findMissingNumber(arr1);
        System.out.println("Array: {3, 0, 1}");
        System.out.println("Missing Number: " + missing1); // Output: 2
        
        System.out.println("---");

        // Test Case 2: Array {9, 6, 4, 2, 3, 5, 7, 0, 1}. n=9. Expected numbers: 0 to 9. Missing is 8.
        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missing2 = solution.findMissingNumber(arr2);
        System.out.println("Array: {9, 6, 4, 2, 3, 5, 7, 0, 1}");
        System.out.println("Missing Number: " + missing2); // Output: 8
    }
}