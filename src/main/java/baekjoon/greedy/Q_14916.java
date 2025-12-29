package baekjoon.greedy;

import java.io.IOException;

public class Q_14916 {
    // 거스름돈 최소 개수 구하기
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int coin = Integer.valueOf(br.readLine());
//        int count = 0;
//        while (coin > 0) {
//            if (coin % 5 == 0) {
//                System.out.println(coin / 5);
//                break;
//            }
//            coin -=2;
//            count++;
//
//        }
//
//        if (coin < 0) {
//            System.out.println(-1);
//        }else {
//            System.out.println(count);
//        }

        // 2원짜리와 5원짜리 동전으로 거슬러 줄 때, 최소 개수를 구하는 문제

        // 1. 숫자를 입력받는다.
        // 2. 5원짜리로 최대한 거슬러 준다.
        // 3. 남은 금액을 2원짜리로 거슬러준다.
        // 4. 거슬러줄 수 없으면 -1을 출력한다.

        // 거슬러줄 수 있는 경우?
        // 1. 5원짜리로 나누어 떨어지는 경우
        // 2. 5원짜리로 나누어 떨어지지 않더라도, 남은 금액이 2원짜리로 거슬러 줄 수 있는 경우
        //    (남은 금액이 짝수인 경우)
        // 거슬러줄 수 없는 경우?
        //



        // 1. 금액을 입력받는다.
        // 2. 입력받은 금액을 5와 2로 나눠 0원이 될 때까지 반복한다.

        // 3. 5로 나눈다.
        // 4. 나머지가 0이면, 몫을 출력한다.

        // 5. 나머지가 1 또는 3이면, 5로 나눈 몫에서 1을 빼고, 나머지에 5를 더한다.
        // 6. 나머지를 2로 나눈다.
        // 7. 나머지가 0이면, 몫을 출력한다.
        // 8. 나머지가 1이면, -1을 출력한다.


    }

}
