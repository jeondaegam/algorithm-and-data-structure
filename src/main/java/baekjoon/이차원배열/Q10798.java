package baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10798 {
    public static void main(String[] args) throws IOException {

        // 100 * 100 boolean 배열을 만든다
        // 입력받은 위치에서 가로 세로 10만큼의 범위를 모두 true로 만든다.
        // true의 카운트를 센다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = 0;
        boolean[][] array = new boolean[100][100];
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    array[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[i][j]) {
                    count += 1;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}
