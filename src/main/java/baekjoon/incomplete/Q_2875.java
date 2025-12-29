package baekjoon.incomplete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2875 {
    public static void main(String[] args) throws IOException {

        // 입력받는다

        // 여학생 수를 2로 나눈다.

        // 여학생 수 - 남학생 수를 빼 = 팀수
        // 여학생 수가 더 적으면 ? 여학생 수만큼 = 팀수 가 됨

        // 인턴십 학생 수 = 남학생, 여학생 중에서 누구를 몇명 빼야 최대 개수를 만들 수 있는지도 고려

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s");

//        int girls = Integer.valueOf(str[0]) / 2;
        int girls = Integer.valueOf(str[0]);
        int boys = Integer.valueOf(str[1]);
        int internship = Integer.valueOf(str[2]);

//        int team = (girls > boys) ? boys : girls;
        int team = Math.min(girls / 2, boys); // 최대 팀 개수
        girls -= (team * 2);
        boys -= team;

        //나머지 인원에서 인턴십 인원을 빼준다.
        int leftOver = girls + boys - internship;

        if (leftOver >= 0 ) {
            System.out.println(team);
        } else {

        }


        team -= internship;

        System.out.println(team);
    }
}
