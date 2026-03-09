
package study202601.ch8;

import java.util.Scanner;

public class Q_1 {
    static int n;
    static int[] arr;
    static int total;
    static String answer = "NO";

    public static void DFS(int index, int sum) {

        if (sum == total / 2) {
            answer = "YES";
            return;
        }

        if (index == n) return;

        DFS(index + 1, sum + arr[index]); // 사용
        DFS(index + 1, sum);              // 미사용
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0);

        System.out.println(answer);
    }
}
