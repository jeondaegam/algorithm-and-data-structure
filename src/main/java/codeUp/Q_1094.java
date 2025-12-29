package codeUp;

import java.util.Scanner;

public class Q_1094 {

/*

    [기초-1차원배열] 이상한 출석 번호 부르기 2

    출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.

    번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
    n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.

    입력예시
    10
    10 4 2 3 6 6 7 9 8 5

    출력 예시
    5 8 9 7 6 6 3 2 4 10

*/

    public static void main(String[] args) {

        System.out.println("입력하세요--");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        String numbers = scan.nextLine();

        String[] numberList = numbers.split(" ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(numberList[i] + " ");
        }

    }
}
