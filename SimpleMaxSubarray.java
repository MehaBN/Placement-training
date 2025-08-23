/*Maximum Subarray: Given an integer array nums, find the sub-array with largest
sum and return its sum. Leet Code problem 53 */

import java.util.Scanner;

public class SimpleMaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Initialize
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        // Loop to find max sum subarray
        for (int i = 1; i < n; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Output result
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
