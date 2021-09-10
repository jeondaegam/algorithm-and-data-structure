package leetCode.easy;

public class Q136_SingleNumber {
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [4,1,2,1,2]
Output: 4

xor 연산을 활용한다.
xor => 두 개의 동일한 값을 xor 연산하면 0이 된다. (=없어진다.)
동일한 값이 3개일 경우? 그대로 남는다.
*/

    // best answer
    static public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            //System.out.print(ans + "(ans)" + "^" + num + "(num)");
            ans = ans ^ num;
            //System.out.println(" => " + ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("result =" + singleNumber(new int[]{3, 4, 5, 5, 4, 3, 1, 7, 7}));
    }

/*

    // my wrong answer
    public int wrongAnswer(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) result = nums[j];
                //마지막 요소를 방문할 때까지 i값이 1개라는 것을

            }
            if (result != nums[i]) return nums[i];
        }
        return -1;
    }
*/
}
