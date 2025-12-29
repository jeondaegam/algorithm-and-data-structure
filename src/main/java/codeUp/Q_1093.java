package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1093 {
    /*

        [기초-1차원배열] 이상한 출석 번호 부르기 1

        선생님은 수업을 시작하기 전에 출석부를 보고 번호를 부르는데, 번호를 무작위(랜덤)으로 부른다.

        이름이 잘 기억되지 않는 학생들은 번호를 여러 번 불러
        이름과 얼굴을 빨리 익히려고 하는 것이다.

        출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.

        입력
        첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
        두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.

        출력
        1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.

        입력 예시
        10
        1 3 2 2 5 6 7 4 5 9

        출력 예시
        1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0

    */
    public static void main(String[] args) {
        System.out.println("학생 수와 무작위로 출석번호를 불러보세요");
        Scanner scan = new Scanner(System.in);

        // 학생 수
        int numberOfStudents = scan.nextInt();
        scan.nextLine(); // 학생수를 엔터키를 치면 개행문자가 버퍼에 남아있기 때문에 nextLine을 호출해 개행문자를 가져가도록 한다.

        // 출석번호 호명받기
        String calledNumber = scan.nextLine(); // 다음라인의 문자를 가져온다.

        // 호명받은 출석번호 리스트
        int[] attendanceNumberList = Arrays.stream(calledNumber.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // 23명의 출석부
        int[] studentList = new int[23];

        //불러진 출석번호 리스트를 for문을 돈다.
        for (int num : attendanceNumberList) {
            studentList[num - 1] += 1;
        }

        //불러진 횟수를 카운팅 한다.

//        System.out.println(Arrays.toString(studentList));
        for (int i = 0; i < studentList.length; i++) {
            System.out.print(studentList[i] + " ");
        }

    }
}
