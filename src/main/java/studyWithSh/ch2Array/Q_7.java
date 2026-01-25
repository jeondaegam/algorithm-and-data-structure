package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_7 {
    /**
     * 점수 계산
     */
    public static void main(String[] args) throws IOException {
        /*
            1. 문제의 개수 N을 입력받는다. (10)
            2. N개의 체점 결과를 입력받는다. (1 0 1 1 1 0 0 1 1 0) (1:정답, 0:오답)
            3. N만큼 반복하면서
                - 1이면: point를 +1하고, sum에 누적한다.
                - 0이면: point를 0으로 초기화

            - 정답일 때마다, 누적된 연속점수를 총 점수에 매번 더해준다.

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int answer = getSolution(N, input);
        System.out.println(answer);

    }

    private static int getSolution(int N, String[] input) {
        int sum = 0;
        int point = 0;

        for (int i = 0; i < N; i++) {
            if(input[i].equals("1")) {
                point++;    // 연속 정답일 경우 점수+1
                sum += point;   // 연속 점수를 바로 총점수에 더해준다.
            } else {
                point = 0; // 오답이면 점수 초기화
            }
        }

        return sum;
    }
}