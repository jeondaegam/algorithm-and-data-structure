package study202601.ch3;

import java.util.Scanner;

public class Q_4 {
    /**
     * 연속 부분수열 (투 포인터 + 슬라이딩 윈도우)
     */
    public static void main(String[] args) {
        /**
         * 1. 정수 N, M 입력
         * 2. 수열 입력
         * 3. lt = 0, sum = 0 초기화
         * 4. rt를 0부터 N-1까지 이동
         *    - sum에 arr[rt] 더함
         *    - sum이 M이면 카운트 증가
         *    - sum이 M 이상이면
         *        lt를 이동시키며 sum 감소
         *        그 과정에서 sum == M이면 카운트
         * 5. rt가 끝까지 가면 종료
         */

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int answer = getSolution(N, M, arr);
        System.out.println(answer);

    }

    private static int getSolution(int N, int target, int[] arr) {
        int count = 0, sum = 0;
        int left = 0;

        for (int right = 0; right < N; right++) {
            sum += arr[right];
            if (sum == target) {
                count++;
            } else if (sum > target) {
                // sum = sum - arr[left]
                // left를 우측으로 한칸 이동
                // 그런다음 sum == target이면 카운팅
                sum -= arr[left++];
                if (sum == target) {
                    count++;
                }
            }

        }

        return count;
    }
}
