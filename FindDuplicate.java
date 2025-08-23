import java.util.*;
class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
         nums[i] = sc.nextInt();
        // findDuplicate(nums);
        System.out.println(findDuplicate(nums));
    }

}