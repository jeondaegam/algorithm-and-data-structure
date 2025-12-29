package leetCode.easy;

public class Q_35_SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInssert(new int[]{1, 3, 5, 6}, 5)); // => 2
    }

    private static int searchInssert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) right = mid;
            else left = mid + 1;

        }

        return target > nums[left] ? left + 1 : left;
    }
}
