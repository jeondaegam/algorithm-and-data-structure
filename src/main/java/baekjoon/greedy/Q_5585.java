package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5585 {
    public static void main(String[] args) throws IOException {
        // 구매하려는 물품의 금액을 입력하게.

        // 당신은 10,000원을 냈군

        // 거스름돈의 개수를 세어보게.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.valueOf(br.readLine());
        int count = 0;
        int change = 1000 - cost;

        System.out.printf("거스름돈 : %d\n", change);
        int[] piggyBank = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < piggyBank.length; i++) {

            // 나눈 몫 : 줘야하는 코인 개수
            count += change / piggyBank[i];
            // 나머지 : 다음 동전으로 계산할 값
            change = change % piggyBank[i];
//            System.out.printf("%d엔 - 나머지: %d엔, 동전개수:%d\n",piggyBank[i], change, count);

        }
        System.out.printf("%d", count);
    }
}
