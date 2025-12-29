package codeUp;

import java.util.Scanner;

public class Q_1096 {
    /*

        [기초-2차원배열] 바둑판에 흰 돌 놓기

        바둑판(10 * 10)에 n개의 흰 돌을 놓는다고 할 때,
        n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.

        참고
        가로번호, 세로번호를 사용할 수 있는 2차원 배열을 사용하면
        이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.

        흰 돌이 올려진 바둑판의 상황을 출력한다.
        흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.

        입력 예시
        5
        1 1
        2 2
        3 3
        4 4
        5 5

        출력 예시
        1 0 0 0 0 0 0 0 0 0
        0 1 0 0 0 0 0 0 0 0
        0 0 1 0 0 0 0 0 0 0
        0 0 0 1 0 0 0 0 0 0
        0 0 0 0 1 0 0 0 0 0
        0 0 0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0 0 0

    */
    public static void main(String[] args) {

        System.out.println("놓을 바둑돌의 개수와, 자리를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();scan.nextLine();

        int[][] badugBoards = new int[10][10];

        for (int i = 0; i < num; i++) {
            int row = scan.nextInt();
            int column = scan.nextInt();

            badugBoards[row-1][column-1] = 1;
        }

        // (☞ﾟヮﾟ)☞⭐ 다차원 배열을 출력할 땐 deepToString
//        System.out.println(Arrays.deepToString(badugBoards));

        //행의 길이
//        System.out.println(badugBoards.length);

        // 1. 배열의 길이를 미리 고정하는 방법.
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(badugBoards[i][j] + " ");
//            }
//            System.out.println();
//        }

        //2. 배열의 길이를 가변적으로 설정하는 방법.
        for (int i = 0; i < badugBoards.length; i++) {
            int[] inArray = badugBoards[i];

            for (int j = 0; j < inArray.length; j++) {
                System.out.print(inArray[j] + " ");
            }
            System.out.println();
        }

    }
}
