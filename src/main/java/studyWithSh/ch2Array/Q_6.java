package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_6 {
    /**
     * 뒤집은 소수
     */
    public static void main(String[] args) throws IOException {
        /*
            1. 문자열로 된 숫자를 뒤집는다.
            2. 뒤집은 숫자가 소수이면 출력한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        String answer = getSolution(N, input);
        System.out.println(answer);
    }

    private static String getSolution(int N, String[] input) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(
                    new StringBuilder(input[i]).reverse().toString()
            );

            if (isPrime(num)) {
                answer.append(num).append(" ");
            }
        }
        return answer.toString().trim();
    }

    /**
     * 소수 판별
     * - 2 미만은 소수가 아니다.
     * - 2부터 √num 까지만 나눠보면 충분하다
     */
    private static boolean isPrime(int num) {
        if (num < 2) return false;

        // i는 2부터 시작, i*i(√num) 가 num보다 작거나 같을 때까지만 반복
        for (int i = 2; i * i <= num; i++) {
            // num이 i로 나누어 떨어지는 순간 false, (소수의 정의 기억)
            if (num % i == 0) return false;
        }

        return true;
    }


}
