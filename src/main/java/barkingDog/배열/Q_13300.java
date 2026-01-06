package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 방 배정
 * https://www.acmicpc.net/problem/13300
 */
public class Q_13300 {
    /*
    <입력>
    학생 인원과 각방 최대 인원을 입력받는다.
    학생 인원 수 만큼 반복하면서
    성별/학년을 입력받는다.

    <연산: 방 개수 구하기>
    학년별로 반복하면서
    인원수를 / 각방 최대 인원으로 나눈다.
    결과값을 누적해서 더한다.
    나머지가 있는 경우 방 개수+1 한다.
    1/2 = 0
    2/2 = 1
    1/2 = 0

    4/2 = 2
    5/2 = 나머지가 있으면 방 개수 +1
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수학여행 참가하는 학생 수
        int K = Integer.parseInt(st.nextToken()); // 한 방의 최대 인원 수

        int[][] students = new int[2][7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            students[x][y]++;

        }

        int rooms = 0;
        for (int l = 0; l < students.length; l++) {
            for (int c = 0; c < students[l].length; c++) {
                int cnt = students[l][c];

//                rooms += (cnt / K);
//                if (cnt % K != 0) rooms++;

                rooms += (cnt + K - 1) / K; // 올림 나눗셈
                // 결과가 2.5이라면 3으로 올림
            }
        }

        System.out.println(rooms);

    }


}
