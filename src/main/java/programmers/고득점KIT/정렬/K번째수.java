package programmers.고득점KIT.정렬;

import java.util.Arrays;

public class K번째수 {

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
