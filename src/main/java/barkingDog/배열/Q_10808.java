package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10808 {
    public static void main(String[] args) throws IOException {

        // 단어 S 를 입력받는다.
        // 각 알파벳이 단어에 몇 개가 포함되어 있는가?

        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int result[] = new int[26];

        // 종료조건: 문자열 길이만큼 반복이 끝나면

        // 문자를 char로 변환하고, a를 뺀다. 그러면 나오는 숫자값이 a=0, b=1 이런식으로 저장됨

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 'a';
            result[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num + " ");
        }
        System.out.println(sb);
    }
}
