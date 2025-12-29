package codeUp;

import java.util.Scanner;

public class Q_1032 {
/*

    10진수를 입력받아 16진수(hexadecimal)로 출력해보자

    10진법은 한 자리에 10개(0 1 2 3 4 5 6 7 8 9)의 문자를 사용하고,
    16진법은 한 자리에 16개(0 1 2 3 4 5 6 7 8 9 a b c d e f)의 문자를 사용한다.
    16진수의 a는 10진수의 10, b는 11, c는 12 ... 와 같다.

    입력예시
    255

    출력예시
    ff

*/

    public static void main(String[] args) {

        System.out.println("정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.printf("%d의 16진수 => %x", num, num);

    }
}
