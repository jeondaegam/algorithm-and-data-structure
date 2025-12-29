package baekjoon.greedy;

import java.io.IOException;
import java.util.Scanner;

public class Q_14720 {
    public static void main(String[] args) throws IOException {
        // 우유 축제
        // 0, 1, 2 종류의 우유가 순서대로 판매된다.
        // 0 -> 1 -> 2 -> 0 -> 1 -> 2 ...
        // 최대 몇 개의 우유를 마실 수 있는가?

        // 1. 가게 수를 입력받는다.
        // 2. 각 가게에서 파는 우유 종류를 입력받는다.

        // 3. 가게를 돌면서 지금 마셔야 하는 우유면 마신다.
        // 4. 다음 우유 순서로 변경한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가게 개수

        int[] store = new int[n];

        for (int i = 0; i < n; i++) {
            store[i] = sc.nextInt();
        }

        int result = 0; // 마신 우유 개수
        int next = 0; // 다음에 마셔야할 우유

        // 가게 개수마늠 돌면서
        // 지금 마셔야 하는 우유인지 체크한다.

        for (int i = 0; i < n; i++) {
            if (store[i] == next) {
                result++; // 우유 마시기
                next = (next +1) % 3; // 우유 마시면 다음 우유로 변경 ( 0 -> 1 -> 2 -> 0 ...) 순환
            }
        }

        System.out.println(result);

    }
}
