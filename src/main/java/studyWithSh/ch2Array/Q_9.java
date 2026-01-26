package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_9 {
    /**
     * 격자판 최대합
     */
    public static void main(String[] args) throws IOException {
        /*
             1. N×N 크기의 2차원 배열을 입력받는다.

             2. 각 행의 합을 구한다.
                - i번째 행의 모든 값을 더해 행의 합을 계산한다.

             3. 각 열의 합을 구한다.
                - i번째 열의 모든 값을 더해 열의 합을 계산한다.
                * 행과 열은 같은 반복문 안에서 동시에 계산할 수 있다.

             4. 두 대각선의 합을 구한다.
                - 좌측 대각선: (0,0), (1,1), (2,2) ...
                - 우측 대각선: (0,N-1), (1,N-2), (2,N-3) ... (예:(0,4), (1,3), (2,2), (3,1), (4,0))

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] input = new String[N][N];

        for (int i = 0; i < N; i++) {
            input[i] = br.readLine().split(" ");
        }

        int answer = getSolution(N, input);
        System.out.println(answer);

    }

    /**
     * 행, 열, 두 대각선의 합중 최대값을 계산한다.
     *
     * @param N
     * @param input
     * @return
     */

    private static int getSolution(int N, String[][] input) {
        int max = 0;
        int[][] nums = new int[N][N];

        // int형 배열로 변환
        for (int i = 0; i < N; i++) {
            nums[i] = Arrays.stream(input[i])
                    .mapToInt(Integer::parseInt).toArray();
        }

        // 행, 열의 합
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < N; j++) {
                rowSum += nums[i][j];
                colSum += nums[j][i];
            }
            max = Math.max(max, rowSum);
            max = Math.max(max, colSum);
        }


        // 대각선의 합
        int leftDiag = 0;
        int rightDiag = 0;

        for (int i = 0; i < N; i++) {
            leftDiag += nums[i][i]; // 좌측 대각선의 합
            rightDiag += nums[i][(N - 1) - i]; // 우측 대각선의 합
        }

        max = Math.max(max, leftDiag);
        max = Math.max(max, rightDiag);

        return max;
    }
}
