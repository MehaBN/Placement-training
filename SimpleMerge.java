import java.util.*;

public class SimpleMerge {
    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    // swap intervals[i] and intervals[j]
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }

        // Step 2: Create a list to hold merged intervals
        ArrayList<int[]> result = new ArrayList<>();

        // Step 3: Traverse and merge using a for loop
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If list is empty or no overlap, just add it
            if (result.size() == 0 || result.get(result.size() - 1)[1] < start) {
                result.add(new int[]{start, end});
            } else {
                // Overlap — merge by updating end value
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], end);
            }
        }

        // Step 4: Convert result list to 2D array
        int[][] mergedIntervals = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            mergedIntervals[i] = result.get(i);
        }

        return mergedIntervals;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] merged = merge(intervals);

        // Print merged intervals
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i][0] + " " + merged[i][1]);
        }
    }
}
