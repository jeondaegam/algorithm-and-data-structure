package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_8 {
    /**
     * 등수 구하기
     */
    public static void main(String[] args) throws IOException {
        /*
            [풀이 아이디어]

            - 내 점수보다 높은 점수가 몇 명인지 세면 등수를 구할 수 있다.
            - 내 점수보다 큰 점수가 k명 있으면 → 내 등수는 k + 1
            - 같은 점수는 서로를 넘지 않기 때문에 동점자가 자동으로 같은 등수가 된다.

            [풀이 절차]
            1. 학생 수 N을 입력받는다.
            2. N명의 점수를 입력받는다.
            3. 각 학생마다 반복하면서
                - 등수를 1로 시작한다.
                - 모든 학생과 점수를 비교한다.
                - 나보다 점수가 큰 학생이 있으면 등수를 1 증가.
            4. 계산된 등수를 순서대로 출력한다.
        */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        String answer = getSolution(N, input);
        System.out.println(answer);

    }

    /**
     * @param N     학생 수
     * @param input 학생 점수 배열
     * @return 입력 순서대로 계산한 등수 문자열
     */
    private static String getSolution(int N, String[] input) {
        StringBuilder answer = new StringBuilder();
        // int 배열로 변환
        int[] scores = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .toArray();

        // 모든 학생 수만큼 반복
        for (int i = 0; i < N; i++) {

            // 현재 학생 점수
            int targetScore = scores[i];
            int rank = 1;

            // 모든 학생과 비교: 나보다 점수가 높은 학생이 있으면 등수 증가
            for (int j = 0; j < N; j++) {
                if (scores[j] > targetScore) {
                    rank++;
                }
            }
            answer.append(rank).append(" ");
        }

        return answer.toString().trim();
    }
}