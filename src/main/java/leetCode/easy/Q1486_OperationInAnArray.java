package leetCode.easy;

public class Q1486_OperationInAnArray {

/*
    1486. XOR Operation in an Array

    Given an integer n and an integer start.
    Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
    Return the bitwise XOR of all elements of nums.

    => start는 array의 첫번째 요소
    => n은 array 요소의 개수

    start 부터 시작해 n개의 요소를 구해 배열에 저장한 뒤, 모든 요소를 XOR 연산 한다.

*/

    public static int xorOperationGoodCode(int n, int start) {
        // XOR 연산을 하기 위한 배열을 만들 필요도 없다!
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + 2 * i;
        }

        System.out.println("Input: n = " + n + ", start = " + start);
        System.out.println("Output: " + result);

        return result;
    }



/*  My answer
    1. 배열을 선언한다.
    2. for문으로 각 요소를 구한다.
    3. 모든 요소를 XOR 연산 한다.
    => 어차피 모든 요소를 XOR 해야하니까 2번에서 같이 하면 되지 않을까?
*/

    public static int xorOperationMyCode(int n, int start) {

        int[] nums = new int[n];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }

        System.out.println("Input: n = " + n + ", start = " + start);
        System.out.println("Output: " + result);

        return result;
    }

    public static void main(String[] args) {

        xorOperationMyCode(5, 0); // 8
        // Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.

        xorOperationMyCode(4, 3); // 8
        // Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

        xorOperationGoodCode(4, 3);


    }
}
