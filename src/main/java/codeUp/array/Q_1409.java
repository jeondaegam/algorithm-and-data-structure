package codeUp.array;

import java.util.Scanner;

public class Q_1409 {
    public static void main(String[] args) {
/*
        기초5-1. 1차원 배열
        [1409] 기억력 테스트 1

        주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
        이번에는 주현이가 좋아하는 '또봇'이라는 로봇변신 자동차가 상품으로 걸려있다.
        주현이가 '또봇'을 가질 수 있도록 프로그래밍하시오.

        입력
        첫째 줄에 숫자 10개가 차례대로 입력된다.
        둘째 줄에 k값이 입력된다.

        출력
        k번째 숫자가 무엇이었는지 출력한다.

        입력 예시
        10 9 8 7 6 5 4 3 2 1
        3

        출력 예시
        8

 */
        System.out.println("숫자 10개를 차례대로 입력하세요 : ");
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();

        }

        System.out.println("몇 번째 숫자를 출력핧까요? :");
        int numberth = scan.nextInt();

        System.out.println("Result : " + numbers[numberth-1]);

    }
}
