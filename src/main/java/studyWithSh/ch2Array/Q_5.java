package studyWithSh.ch2Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_5 {
    /**
     * 소수 (에라토스테네스 체, 약수가 1과 자기 자신뿐인 수)
     */
    public static void main(String[] args) {
        /*
            1부터 N까지 소수의 개수 구하기

            1. 처음에는 모든 수를 소수라고 가정
            2. 0과 1은 소수가 아니다
            3. 2부터 N까지 반복하면서
            3-1. i가 소수라면
            4. i의 배수들은 소수가 아니다
            5. 끝까지 살아남은(true) 소수의 개수를 카운팅
         */

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int answer = getSolution(N);
        System.out.println(answer);
    }

    private static int getSolution(int N) {
        int answer = 0;
        // index = 숫자, value = 소수 여부
        boolean[] isPrime = new boolean[N + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }
        return answer;
    }
}
