package codeUp;

import java.util.Scanner;

public class Quest1080 {
/*
    [기초-종합] 언제까지 더해야 할까?

    1, 2, 3 ... 을 계속 더해 나갈 때,
    그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
    계속 더하는 프로그램을 작성해보자.

    1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
    입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.

    입력예시
    55

    출력예시
    10
*/


    public static void main(String[] args) {
/*
        1. 정수를 입력받는다.
        2. 1~1000사이인지 체크한다.
        3. 범위 밖 정수라면 다시 입력받는다.
        4. 1부터 n까지 더한다.
        5. 더한 값이 n과 같거나 큰지 확인한다.
        6. n과 같거나 크다면 마지막에 더한 수를 출력한다.
*/
        int num = -1;
        int sum = 0;
        while (num < 0 || num > 1000) {
            System.out.println("정수를 입력하세요 1~1000");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            sum += i;
            if (sum >= num) {
                System.out.println("마지막에 더한 값: " + i);
                return;
            }
        }
        System.out.println("종료");


    }
}
