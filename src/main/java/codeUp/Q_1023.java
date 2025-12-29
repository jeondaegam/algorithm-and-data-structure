package codeUp;

import java.util.Scanner;
/*

* float과 double의 차이는 무엇일까???
* https://devlog-wjdrbs96.tistory.com/254

실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

(단, 입력값은 절댓값이 10000을 넘지 않으며, 소수점 이하 자릿수는 최대 6자리까지이고
0이 아닌 숫자로 시작한다.)

입력예시 => 1.414213
출력예시
1
414213

*/

public class Q_1023 {
    public static void main(String[] args) {

        System.out.println("실수를 입력하세요");
        Scanner scan = new Scanner(System.in);

//        Scanner scan = new Scanner(System.in).useDelimiter("\\s|\\.");
//        String firstNumber = scan.next();
//        String lastNumber = scan.next();
//        System.out.print(firstNumber + "\n" + lastNumber);
//
        float number = scan.nextFloat();
        if (number > 10000) {
            System.out.println("입력값은 10000을 넘길 수 없습니다.");
        }

        String numArr[] = String.valueOf(number).split("\\.");
        for (String num : numArr) {
            System.out.println(num);
        }



    }
}
