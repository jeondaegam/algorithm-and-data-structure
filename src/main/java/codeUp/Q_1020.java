package codeUp;

import java.util.Scanner;

public class Q_1020 {
/*
    주민번호 입력받아 형태 바꿔 출력하기
    입력 => 900101-2111111
    출력 => 9001012111111
*/

    public static void main(String[] args) {
        System.out.println("주민등록번호를 입력하세요~");

        Scanner scan = new Scanner(System.in).useDelimiter("\\s|-");
        String firstNumber = scan.next();
        String lastNumber = scan.next();

        System.out.println("입력된 주민번호: " + firstNumber + lastNumber);


    }

}
