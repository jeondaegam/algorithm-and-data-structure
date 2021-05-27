package codeUp;

import java.util.Scanner;

public class Quest1090 {
    /*
    어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

    예를 들어
    2 6 18 54 162 486 ... 은
    2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.

    이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
    등비(비율이 같다의 한문 말) 수열이라고 한다.

    "그럼.... 13번째 나오는 수는 뭘까?"

    시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
    n번째 수를 출력하는 프로그램을 만들어보자.

    입력 예시
    2 3 7

    출력 예시
    1458

     */

    public static void main(String[] args) {
        System.out.println("시작 값, 등비, 알고싶은 n번째 정수를 입력해.");
        Scanner scan = new Scanner(System.in);

        long startNumber = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();

        for (int i = 0; i < n - 1; i++) {
            startNumber = startNumber * r;
            System.out.println(startNumber);
        }

    }
}

