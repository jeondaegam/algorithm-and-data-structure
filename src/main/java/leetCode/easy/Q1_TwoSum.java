package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum {
/*

    array of integers  nums와 integer target 1개를 입력받는다.
    nums의 두 수를 더해 target을 만든다.
    이 때 nums의 각 숫자는 몇번째 index인지 리턴하라.

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/
/*
    public static int[] twoSum(int[] nums, int target) {
        // 배열을 리턴하고,
        // 배열과 int형 변수를 받는다
//        if (nums.length() >2 || nums.length() > 10^4) return 0;

        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] =i;
                    results[1] =j;
                }
            }
        }
        return results;
    }
*/
    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int [] numbers = {2,11,15,7};
        int target =9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

}
