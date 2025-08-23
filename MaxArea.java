// public class MaxArea {

// public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int maxArea = 0;
        
//         while (left < right) {
//             int h = Math.min(height[left], height[right]);
//             int w = right - left;
//             int area = h * w;
//             maxArea = Math.max(maxArea, area);
            
//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
        
//         return maxArea;
//     }

//         public static void main(String[] args) {
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         MaxArea sol = new MaxArea();
//         int result = sol.maxArea(height);
//         System.out.println("Maximum area: " + result);
//     }
// }

public class MaxArea {

    public int maxArea(int[] height) {
        int maxArea = 0;

        // Try every pair (i, j)
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaxArea sol = new MaxArea();
        int result = sol.maxArea(height);
        System.out.println("Maximum area: " + result);
    }
}
