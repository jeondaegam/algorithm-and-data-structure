package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1098 {
    /*

         [기초-2차원배열] 바둑알 십자 뒤집기

         격자판의  가로(w), 세로(h), 막대의 개수(n), 각 막대의 길이(l),
         막대를 놓는 방향(d:가로는 0, 세로는 1)과
         막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,

         격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.

         입력
         첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
         두 번째 줄에 놓을 수 있는 막대의 개수(n)
         세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.

         출력
         모든 막대를 놓은 격자판의 상태를 출력한다.
         막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
         단, 각 숫자는 공백으로 구분하여 출력한다.

         입력예시
         5 5
         3
         2 0 1 1
         3 1 2 3
         4 1 2 5

         출력 예시
         1 1 0 0 0
         0 0 1 0 1
         0 0 1 0 1
         0 0 1 0 1
         0 0 0 0 1
    */
    public static void main(String[] args) {
//        System.out.println("격자판의 가로 세로 크기와, 막대의 개수, " +
//                "막대의 길이 막대를 놓는 방향(가로:0,세로:1), " +
//                "\n 막대의 가장 왼쪽 또는 위쪽 위치를 입력하세요");
        System.out.println("격자판의 가로 세로 크기를 입력하세요.");

        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();

        System.out.println("막대의 개수를 입력하세요");
        //막대의 개수
        int n = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];

        //막대의 길이, 방향, 좌표 (막대의 개수만큼)
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "번째 막대의 길이, 방향(가로:0, 세로1), 좌표를 입력하세요.");
            // 4개의 숫자를 한번에 입력받아서 배열 한칸에 넣는다.
            arr[i] = scan.nextLine();

        }


        System.out.println(row + "행 " + column + "열의 격자판을 만듭니다.");
        System.out.println("막대의 개수는" + n + "개입니다.");
        System.out.println("배열의 내용은 " + Arrays.toString(arr) + "입니다.");

        // 바둑판 생성
        int[][] matrix = new int[row][column];

        //막대의 방향과 길이만큼 1로 마킹한다.
        for (int i = 0; i < arr.length; i++) {
            //순서 => 막대 길이, 방향, 좌표
            int inArr[] = Arrays.stream(arr[i].split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int length = inArr[0];
            int direction = inArr[1];
            int x = inArr[2];
            int y = inArr[3];

            matrix[x][y] = 1;

            if (length > 0) {
                for (int j = 0; j  <length; j++) {
                    // 가로 방향일 때
                    if (direction == 0) {
                        x += 1;
                        matrix[x][y] = 1;
                    } // 세로방향일때
                    y += 1;
                    matrix[x][y] = 1;
                }

            }
        }
//        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            int[] inMatrix = matrix[i];

            for (int j = 0; j < inMatrix.length; j++) {
                System.out.print(inMatrix[j] + " ");
            }
            System.out.println();
        }


    }
}
