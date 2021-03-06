package codeUp;

import java.util.Scanner;

public class Quest1081 {
    /*

        [기초-종합] 주사위를 2개 던지면?

        1부터 n까지, 1부터 m까지 숫자가 적힌
        서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

        입력
        주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
        단, n, m은 10이하의 자연수

        출력
        나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
        첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.

        입력 예시
        2 3

        출력 예시
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3

    */
    public static void main(String[] args) {

        //solution(2, 3);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }



    }

    private static void solution(int n, int m) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }

    }
}
