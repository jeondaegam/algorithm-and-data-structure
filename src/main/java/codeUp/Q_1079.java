package codeUp;

import java.util.Scanner;

public class Q_1079 {
/*
    원하는 문자가 입력될 때까지 반복 출력하기

    'q'가 입력 될때까지 입력한 문자를 계속 출력
*/

    public static void main(String[] args) {

        //1. 입력받는다.
        //2. q인가?
        //3. q일경우 멈춘다.
        //4. q가 아니면 다시 입력받는다.

        System.out.println("입력하세요. q 입력시 종료.");
        Scanner scan = new Scanner(System.in);
        String letter;

        while (true) {
            letter = scan.next();
            System.out.println(letter);
            if ("q".equals(letter)) return;
        }

    }

}
