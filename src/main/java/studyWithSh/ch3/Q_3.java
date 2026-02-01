package studyWithSh.ch3;

import java.util.Scanner;

public class Q_3 {
    /**
     * 최대 매출
     */
    public static void main(String[] args) {
        /**
         * 연속된 N일의 매출중 가장 큰 매출액 구하기
         *  1. 정수 N과 연속 일수K, N일동 안의 매출기록을 입력받는다.
         *  2. 처음 K일까지의 매출 합을 구한다.
         *  3. 이후 K부터 N-1까지 반복된다.
         *  4. 이전 합에서 (i-K)번째 매출은 뺴고, i번째 매출을 더한다.
         *  5. 매번 최대값을 갱신한다.
         */

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = scan.nextInt();
        }

        int answer = getSolution(N, K, input);
        System.out.println(answer);

    }

    private static int getSolution(int N, int K, int[] input) {
        int sum = 0;
        int max = 0;

        // 처음 K일의 매출 합을 구한다.
        for (int i = 0; i < K; i++) {
            sum = sum + input[i];
        }

        max = sum;
        // K부터 반복하면서 K-1을 빼고 K+1을 더한다.

        for (int i = K; i < N; i++) {
            sum += input[i];
            sum -= input[i - K]; // input[0], [1], [2]..
            max = Math.max(max, sum);
        }

        return max;
    }
}
