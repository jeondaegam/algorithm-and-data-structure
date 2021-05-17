package codeUp;

import java.util.Scanner;

public class Quest1070 {
/*

    월 입력받아 계절 출력하기

    월 : 계절 이름
     12, 1, 2 : winter
     3, 4, 5 : spring
     6, 7, 8 : summer
     9, 10, 11 : fall

    입력 예시
    12
    출력 예시
    winter

*/

    public static void main(String[] args) {

        System.out.println("what is your favorite season?");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month) {
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
            case 12, 1, 2:
                System.out.println("winter");
                break;
            default:
                System.out.println("what?");
        }

        // * 또 다른 방법  --> break문이 없으면 멈추지 않고 다음 명령이 실행되는 특성 이용하기
/*
        case 3:
        case 4:
        case 5:
        System.out.println("spring");

*/
    }
}
