package baekjoon.심화1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) throws IOException {

        // 주석은 5를 입력받았을 때 기준으로 작성되었음

        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = scan.nextInt();
        int total = (2 * N) - 1;
        int center = total / 2;

        // i = 0 ~ 4번째줄
        for (int i = 0; i <= center; i++) {
//            System.out.print(i + " ");
            // 공백 찍기 (4 > 3 > 2 > 1 > 0)
            for (int j = 0; j < (center - i); j++) {
                bw.write(" ");
            }

            // 별 찍기 (1 > 3 > 5 > 7 > 9)
            for (int k = 0; k < (i * 2) + 1; k++) {
                bw.write("*");
            }

            bw.newLine();
        }

        // 반대로 줄어들기 (i = 5 ~ 8번째줄)
        for (int i = (center - 1); i >= 0; i--) {

            // 공백 찍기
            for (int j = 0; j < (center - i); j++) {
                bw.write(" ");
            }

            // 별찍기 ( 7 > 5 > 3 > 1)
            for (int k = 0; k < (i * 2) + 1; k++) {
                bw.write("*");
            }

           bw.newLine();
        }

        bw.close();

    }
}
