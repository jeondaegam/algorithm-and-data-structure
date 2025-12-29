package leetCode.easy;

import java.util.Arrays;


public class Q_167_TwoSum2_InputArrayisSorted {
/*
    Q167. Two Sum 2 - Input array is sorted

    Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
    Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
    The tests are generated such that there is exactly one solution. You may not use the same element twice.

    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

*/

    private static int[] twoSum(int[] numbers, int target) {

        // numbers -> for loof
        // target-numbers[i] ==> exist in numbers?

        for (int i = 0; i < numbers.length; i++) {
            int tg = target - numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] == tg) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{0, 0};
    }

/*    private static int[] twoSum(int[] numbers, int target) {

        // numbers -> for loof
        // target-numbers[i] ==> exist in numbers?

        Map map = new HashMap();
        for (int i=0; i<numbers.length; i++) {
            if (map.containsKey(target-numbers[i]))
                     return new int[]{numbers[i],i+1};
        }
        return new int[]{0,0};
    }*/


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
