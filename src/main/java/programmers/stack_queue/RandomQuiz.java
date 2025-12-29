package programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomQuiz {
    // 배열에서 연속적으로 나타나는 숫자를 제거하고 남은 숫자를 리턴하는 메서드

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        List<Integer> result = solution(arr);

        System.out.println(Arrays.toString(result.toArray()));

    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        // 배열의 원소를 0부터 끝까지 순회하면서

        // 현재 요소의 숫자를 이전 숫자와 비교한다.

        // 이전 숫자와 동일하면 넘어간다.

        // 이전숫자와 다르면 저장한다.

        // 이전숫자에 현재 요소를 저장한다.

        int prev = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != prev) {
                answer.add(arr[i]);
                prev = arr[i];
            }
        }

        return answer;
    }

}
