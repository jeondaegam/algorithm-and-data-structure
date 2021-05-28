package codeUp;

import java.util.Scanner;

public class Quest1407 {
    /*
        길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.

        입력예시
        abC Def gh

        출력예시
        abCDefgh

        do-while문
        while문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.
        하지만, do while문의 경우는 무조건 한번은 실행되는 반복문이다.
    */

    public static void main(String[] args) {

        String str;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("100글자 이하의 문자를 입력하세요.");
            str = scan.nextLine();
        }
        while (str.length() > 100); // 문자열이 100글자 이상이면 do를 계속 반복한다.


        System.out.println(str.replaceAll(" ", ""));

    }
}
