package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1 {
    /**
     * 큰 수 출력하기
     */
    public static void main(String[] args) throws IOException {
        /*
        1. 숫자 N 을 입력받는다.
        2. N개의 정수를 입력받는다.
        3. 첫번째 수를 저장한다.
        4. 정수 N 만큼 반복하면서
        5. 이전 수보다 값이 크면 저장한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        String answer = getSolution(N, input);
        System.out.println(answer);

    }

    private static String getSolution(int N, String input) {
        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder answer = new StringBuilder();
        answer.append(numbers[0] + " ");

        for (int i = 1; i < N; i++) {
            if (numbers[i - 1] < numbers[i]) {
                answer.append(numbers[i] + " ");
            }
        }

        return answer.toString().trim();
    }
}