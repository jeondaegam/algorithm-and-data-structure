package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2908 {
    public static void main(String[] args) throws IOException {
        // 두 수중 더 큰 수를 출력한다.

        // 1. 두 수를 입력받는다.
        // 2. 각 수의 첫자와 끝자를 스위칭 한다.
        // 3. 스위칭한 두 수 중 더 큰 수를 출력한다.

        // StringBuilder의 reverse()를 사용하자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int A = Integer.parseInt(reversNumber(numbers[0]));
        int B = Integer.parseInt(reversNumber(numbers[1]));

        System.out.println(Integer.max(A, B));

    }

    private static String reversNumber(String number) {
        return new StringBuilder(number).reverse().toString();
    }
}
