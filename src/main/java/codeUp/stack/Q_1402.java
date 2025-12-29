package codeUp.stack;

import java.util.Scanner;

public class Q_1402 {
    /*
        [1402] 거꾸로 출력하기 3

       데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
        둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.

        출력
        n개의 데이터를 입력의 역순으로 출력한다.

        입력 예시
        5
        1 3 5 6 8

        출력 예시
        8 6 5 3 1

 */
    public static void main(String[] args) {

        System.out.println("입력할 데이터 개수를 알려줘 :");
        Scanner scan = new Scanner(System.in);
        int theNumber = scan.nextInt();
        int[] numbers = new int[theNumber];

        System.out.println("숫자를 입력해 :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
//        push(numbers);
        pop(numbers);


    }

    private static void pop(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
