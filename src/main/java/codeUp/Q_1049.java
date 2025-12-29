package codeUp;

import java.util.Scanner;
/*

두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력

*/


public class Q_1049 {
    public static void main(String[] args) {
        System.out.println("두 정수 a,b를 입력하세요");
        Scanner scan = new Scanner(System.in).useDelimiter(",|\\s");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        System.out.println((firstNum > secondNum) ? 1 : 0);
//        System.out.printf("%b", firstNum>secondNum);
    }
}
