package study202601.ch9;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt(); // 키
            arr[i][1] = scan.nextInt(); // 몸무게
        }

        int answer = getSolution(n, arr);
        System.out.println(answer);

    }

    private static int getSolution(int n, int[][] arr) {
        // 1. 키 내림차순 정렬
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        int count = 0;
        int maxWeight = 0;

        // 2. 순회하면서 체크
        for (int i = 0; i < n; i++) {
            if (arr[i][1] > maxWeight) {
                count++;
                maxWeight = arr[i][1];
            }
        }

        return count;

    }
}
//
//▣ 입력예제 1
//        5
//        172 67
//        183 65
//        180 70
//        170 72
//        181 60
//
