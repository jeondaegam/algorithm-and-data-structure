package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4 {
    /**
     * 피보나치 수열 (앞의 숫자 2개를 합해 다음 숫자를 만드는 수열)
     */
    public static void main(String[] args) throws IOException {
        /*
           1. 정수 N을 입력받는다. 3이상
           2. 피보나치 수열의 N자리 까지 출력한다.

            초기 세팅
           1. 변수 A에 1을 저장
           2. 변수 B에 1을 저장

           3. N만큼 반복하면서
           4. SUM = A + B
           5. sum을 append한다.
           6. 값을 스위칭 한다. A <= B, B <= SUM
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String answer = getSolution(N);
        System.out.println(answer);

    }

    private static String getSolution(int N) {
        StringBuilder sb = new StringBuilder();
        int prev = 1;
        int next = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = prev + next;
            sb.append(sum).append(" ");
            prev = next;
            next = sum;
        }
        return sb.toString().trim();
    }
}
