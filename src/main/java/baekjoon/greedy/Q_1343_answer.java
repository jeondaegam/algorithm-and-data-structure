package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1343_answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        String blockA = "AAAA";
        String blockB = "BB";

        board = board.replaceAll("XXXX", blockA);
        board = board.replaceAll("XX", blockB);

        if (board.contains("X")) {
            System.out.println(-1);
            return;
        }
        System.out.println(board);

    }
}
