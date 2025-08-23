/* LeetCode 560 – Subarray Sum Equals K
Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals to k. */



import java.util.*;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Handles sum == k case

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);
        System.out.println("Total subarrays with sum = " + k + " : " + result);

        sc.close();
    }
}
