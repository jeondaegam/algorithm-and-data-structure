package baekjoon.이차원배열;

import java.io.*;
import java.util.stream.IntStream;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        // 1. 9 * 9 배열을 입력받는다
        // 2. 0~8까지의 행마다 최댓값을 구한다.
        // 3. 새로운 배열에 저장한다. = 총 9개의 정수가 저장됨
        // 4. 새로운 배열에서 최댓값을 구한다
        // 5. 4의 값이 9*9 행렬에서 몇번째 자리에 있는지 구한다

        // 그 값이 배열의 몇번째 자리에 있는지 어떻게 구하지 ?
        //새로운 배열에 저장된 순서로 몇번째 행에 있는지는 알 수 있음  !

        // 입력받는 방법
        // 1. 총 9줄을 입력받음
        // 2. 1줄을 입력받으면
        // 3. - 9개의 숫자를 추출한뒤
        // 4. - 9개의 열에 넣음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int matrixLength = 9;
        int[][] matrix = new int[matrixLength][matrixLength];
        int[] maxNumbers = new int[matrixLength];

        int totalMax = 0;
        int r = 0, c = 0;

        // 배열 입력받기
        for (int i = 0; i < matrixLength; i++) {
            // 1줄을 입력받는다
            String[] inputs = br.readLine().split(" ");

            // 숫자를 잘라 9칸의 열에 넣는다
            for (int j = 0; j < matrixLength; j++) {
                matrix[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        // 각 행에서 최대값 구하기
        for (int i = 0; i < matrixLength; i++) {
            int[] array = matrix[i];
            maxNumbers[i] = IntStream.of(array).max().getAsInt();
        }

        // 제일 최대값 구하기
        totalMax = IntStream.of(maxNumbers).max().getAsInt();

        // 9 * 9 행렬에서 몇번째 행인지 구하기
        for (int i = 0; i < maxNumbers.length; i++) {
            if (totalMax == maxNumbers[i]) {
                r = i;
                break;
            }
        }

        // 9 * 9 행렬에서 몇번째 열인지 구하기
        for (int i = 0; i < matrixLength; i++) {
            if (totalMax ==matrix[r][i]) {
                c = i;
            }
        }

        r += 1;
        c += 1;

        bw.write(totalMax + "\n");
        bw.write(r + " " + c);

        bw.close();
        br.close();

    }
}

// https://www.acmicpc.net/source/89580149 참고해보기 , 되게 심플하게 짬 
