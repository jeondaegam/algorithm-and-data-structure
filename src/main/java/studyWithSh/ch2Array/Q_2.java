package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2 {
    /**
     * 보이는 학생
     */
    public static void main(String[] args) throws IOException {
        /*
        1. 정수 N을 입력받는다.
        2. N개의 정수를 입력받는다.
        3. N번 반복하면서
        4. 현재 숫자가 이전 숫자보다 크면 카운팅 한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int answer = getSolution(N, input);
        System.out.println(answer);

    }

    private static int getSolution(int N, String input) {
        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int cnt = 1; // 첫 학생은 무조건 보이니까 1로 시작
        int max = numbers[0]; // 현재까지 최대 키

        for (int i = 1; i < N; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                cnt++;
            }
        }
        return cnt;
    }
}
