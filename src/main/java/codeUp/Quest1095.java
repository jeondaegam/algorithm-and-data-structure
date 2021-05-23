package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Quest1095 {
/*

    이상한 출석 번호 부르기 3
    정보 선생님은 오늘도 이상한 출석을 부른다.
    출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?
    출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.


    입력 예시
    10
    10 4 2 3 6 6 7 9 8 5

    출력 예시
    2

*/

    public static void main(String[] args) {

        System.out.println("학생 수와 무작위로 출석번호를 불러보세요.");
        System.out.println("출석번호 번위 (1~23)");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        String numbers = scan.nextLine();

        int[] numberList = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int minimumNumber = 23;

        for (int num : numberList) {
            minimumNumber = minimumNumber < num ? minimumNumber : num;
        }

        System.out.println("minimum number : " + minimumNumber);


    }
}
