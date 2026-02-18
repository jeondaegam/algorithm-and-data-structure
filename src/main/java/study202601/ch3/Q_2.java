package study202601.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2 {
    /**
     * 공통원소 구하기
     */
    public static void main(String[] args) throws IOException {

        /**
         * 1. 포인터 두개 준비
         * 2. 오름차순으로 정렬된 배열 2개를 입력받는다.
         * 3. 두 포인터의 시작점을 각 배열의 처음에 둔다.
         *
         * 4. 두 배열을 탐색한다.
         * - A == B 인경우 : 출력, p1++, p2++
         * - A > B 인 경우: B의 포인터 한칸 이동 (p2++)
         * - A < B 인 경우: A의 포인터 한칸 이동 (p1++)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arrA = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] arrB = br.readLine().split(" ");

        String answer = getSolution(N, M, arrA, arrB);
        System.out.println(answer);

    }

    private static String getSolution(int N, int M, String[] arrA, String[] arrB) {

        int[] numsA = Arrays.stream(arrA).mapToInt(Integer::parseInt).toArray();
        int[] numsB = Arrays.stream(arrB).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numsA);
        Arrays.sort(numsB);

        int pointA = 0, pointB = 0;
        StringBuilder sb = new StringBuilder();

        // 탐색 종료 조건은? 두 배열중 하나라도 탐색이 끝나면 종료
        while (pointA < N && pointB < M) {
            if (numsA[pointA] == numsB[pointB]) {
                sb.append(numsA[pointA]).append(" ");
                pointA++;
                pointB++;
            } else if (numsB[pointB] < numsA[pointA]) {
                pointB++;
            } else {
                pointA++;
            }
        }

        return sb.toString();
    }
}
