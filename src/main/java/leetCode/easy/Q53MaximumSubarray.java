package leetCode.easy;

public class Q53MaximumSubarray {
    /*
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and return its sum.
     * A subarray is a contiguous part of an array.
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * */

    public static void main(String[] args) {
        System.out.println("Output: " + maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static int maxSubArray(int[] nums) {

        int max = nums[0], curSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];

            if (curSum > max) {
                max = curSum;
            }
        }

        return max;
    }
}
