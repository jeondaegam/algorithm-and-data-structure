package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {

    public static void main(String[] args) throws IOException {
        // 세 개의 자연수를 입력받는다.

        // 모두 곱한다.

        // 계산 결과를 String으로 변환한다.

        // [0-9]까지의 숫자가 각각 몇번 쓰였는지 카운팅한다.

        // 계산 결과의 길이만큼 반복하면서

        // 각 숫자에 해당하는 배열 익덱스에 값을 +1 해준다.

        int num = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sum;
        int[] counts = new int[10];

        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }

        sum = String.valueOf(num);

        for (String str : sum.split("")) {
            int val = Integer.parseInt(str);
            counts[val]++;
        }

        for (int i : counts) {
            System.out.println(i);
        }

    }
}
