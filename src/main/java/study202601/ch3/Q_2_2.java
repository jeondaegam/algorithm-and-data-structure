package study202601.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q_2_2 {
    /**
     * 공통원소 구하기
     */
    public static void main(String[] args) {
        /**
         * 1. 포인터 두개 준비
         * 2. 배열 2개를 입력받는다.
         * 3. 두 배열을 오름차순으로 정렬한다.
         * 4. 두 포인터의 시작점을 각 배열의 처음에 둔다.
         *
         * 5. 두 배열을 탐색한다.
         * - A == B 인경우 : 출력, p1++, p2++
         * - A > B 인 경우: B의 포인터 한칸 이동 (p2++)
         * - A < B 인 경우: A의 포인터 한칸 이동 (p1++)
         */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = scan.nextInt();
        }

        int M = scan.nextInt();
        int[] arrB = new int[M];
        for (int i = 0; i < M; i++) {
            arrB[i] = scan.nextInt();
        }

        for (int num : getSolution(N, M, arrA, arrB)) {
            System.out.printf("%d ", num);
        }


    }

    private static List<Integer> getSolution(int N, int M, int[] arrA, int[] arrB) {
        List<Integer> answer = new ArrayList<>();
        int pointA = 0, pointB = 0;

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        while (pointA < N && pointB < M) {
            if (arrA[pointA] == arrB[pointB]) {
                answer.add(arrA[pointA]);
                pointA++;
                pointB++;
            } else if (arrA[pointA] < arrB[pointB]) {
                pointA++;
            } else {
                pointB++;
            }
        }
        return answer;
    }
}
