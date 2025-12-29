package baekjoon.이차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class Q2738 {
    public static void main(String[] args) throws IOException {

        // 1. 행, 열의 개수를 입력받는다
        // 2. 2차원 배열을 2번 입력받는다 (메서드로 분리)
        // 3. 두 배열의 값을 더한다
        // 4. 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // N:행, M:열 개수 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

//        int[][] A = new int[N][M];
//        int[][] B = new int[N][M];

        int[][] A = readMatrix(br, N, M);
        int[][] B = readMatrix(br, N, M);

        // 첫 번째 배열 입력받기
//        for (int i = 0; i < N; i++) {
//            String[] input = br.readLine().split(" ");
//            for (int j = 0; j < M; j++) {
//                A[i][j] = Integer.parseInt(input[j]);
//            }
//        }
        // 두 번째 배열 입력받기
//        for (int i = 0; i < N; i++) {
//            String[] input = br.readLine().split(" ");
//            for (int j = 0; j < M; j++) {
//                B[i][j] = Integer.parseInt(input[j]);
//            }
//        }

        // 두 배열의 값 더하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = A[i][j] + B[i][j];
                bw.write(sum + " ");
            }
            bw.newLine();
        }

        br.close();
        bw.close();

    }

    private static int[][] readMatrix(BufferedReader br, int N, int M) throws IOException {
        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }

}
