package codeUp;

import java.util.Scanner;

public class Q_1069 {
/*

    평가 입력받아 다르게 출력하기
    평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

    * switch( ) 에 주어지는 값은 “정수"값만 가능하며,
      문자도 아스키코드 정수값이기 때문에 가능하다.

    입력
    A

    출력
    best!!!
*/

    public static void main(String[] args) {

        System.out.println("평가점수를 영문자로 입력하세요(A,B,C,D)");
        Scanner scan = new Scanner(System.in);
        String rank = scan.next();

        switch (rank) {
            case "A":
                System.out.println("best!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what??");
                break;
        }


    }
}
