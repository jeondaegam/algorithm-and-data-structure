package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1475 {
    public static void main(String[] args) throws IOException {

        // 각 숫자의 개수만큼 배열에 카운팅 하고 가장 높은 수를 꺼내면 될 것 같다.
        // 1. 모든 수를 카운팅 한다.
        // 2. 6, 9는 묶어서 카운팅

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] count = new int[10];

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0'; // ascii code 값이 나옴
            count[num]++;
        }

        int sixNine = count[6] + count[9];
        int sixNineSet = (sixNine + 1) / 2; // 올림처리 -> 둘의 합의 4이면 5가 되고 5/2 = 2가됨

        int answer = sixNineSet;

        for (int i = 0; i < count.length; i++) {
            if (i == 6 || i == 9) continue;
            answer = Math.max(answer, count[i]);
        }

        System.out.println(answer);

    }
}
