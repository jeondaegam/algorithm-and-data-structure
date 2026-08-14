package programmers.고득점KIT.정렬;

import java.util.Arrays;

public class K번째수 {

    /**
     * 시간복잡도: O(N * M * log(M))
     * "각 command마다 배열을 잘라서 정렬한다면, 최악의 경우 어느 정도 반복할까?"
     *
     * - :배열을 자르는 데 O(N)
     * - :잘라낸 배열을 정렬하는 데 O(N log N)
     *
     * 따라서 O(N log N) 수준의 정렬을 사용해도 충분
     *
     * 사용할 알고리즘/자료구조 떠올리기
     * - : 배열, 정렬
     *
     */

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = solution(array, commands);

        System.out.println(Arrays.toString(answer));

    }

    private static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length]; //

        for (int i = 0; i < commands.length; i++) {
            int[] target = commands[i];

            int from = target[0] - 1; // inclusive
            int to = target[1]; // exclusive

            // array의 i번째부터 j번째까지를 새로운 배열로 가져오는 방법
            int[] copy = Arrays.copyOfRange(array, from, to);

            // 정렬
            Arrays.sort(copy);
            answer[i] = copy[target[2] - 1];
        }

        return answer;
        // 1. 배열의 범위를 자른다.
        // 2. 정렬한다.

        // 3. k번째 수를 찾는다.
    }
}
