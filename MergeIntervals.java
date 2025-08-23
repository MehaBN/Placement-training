import java.util.ArrayList;

public class MergeIntervals {
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

        // Step 2: Merge intervals
        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If result is empty or no overlap, add the interval
            if (result.size() == 0 || result.get(result.size() - 1)[1] < start) {
                result.add(new int[]{start, end});
            } else {
                // Overlap: merge with previous by updating the end
                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], end);
            }
        }

        // Step 3: Convert result to array
        int[][] mergedIntervals = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            mergedIntervals[i] = result.get(i);
        }

        return mergedIntervals;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {8, 10},
            {1, 3},
            {2, 6},
            {15, 18}
        };

        int[][] merged = merge(intervals);

        // Print result
        for (int i = 0; i < merged.length; i++) {
            System.out.println("[" + merged[i][0] + ", " + merged[i][1] + "]");
        }
    }
}
