package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("한줄에 몇명이 앉는지 입력하게 .");
        int num = Integer.valueOf(br.readLine());

        System.out.println("혼자인 자와 동행인 자들을 표기하게 .");
        String seat = br.readLine();
        int holder = 1;
        int coupleCount = 0;

        for (int i = 0; i < seat.length(); i++) {
            char who = seat.charAt(i);

            if (who == 'S') {
                holder++;
            } else if (who == 'L') {
                coupleCount++;
                if (coupleCount == 2) {
                    holder++;
                    coupleCount = 0;
                }
            }
        }


        System.out.println(holder < num ? holder : num);

    }
}
