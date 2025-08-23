public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int xorAll = 0;
        int xorArr = 0;

        for (int i = 1; i <= n; i++)
            xorAll ^= i;

        for (int num : nums)
            xorArr ^= num;

        return xorAll ^ xorArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 5};
        int[] nums2 = {7, 1, 2, 4, 5, 6};

        System.out.println("Missing number in [2,3,1,5]: " + findMissingNumber(nums1)); // 4
        System.out.println("Missing number in [7,1,2,4,5,6]: " + findMissingNumber(nums2)); // 3
    }
}
