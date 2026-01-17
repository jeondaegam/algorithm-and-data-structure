package studyWithSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_7 {
    /**
     * 회문 문자열(앞에서 읽든, 뒤에서 읽든 같은 문자열)
     */
    public static void main(String[] args) throws IOException {
        // 1. 문자열을 입력받는다.
        // 2. 소문자로 변환한다.
        // 3. 문자열을 뒤집기 전과, 후의 문자가 동일한지 체크한다.

        // 입력/출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(getSolution(input));

    }

    // 문제해결
    private static String getSolution(String input) {
        String reversedStr = new StringBuilder(input.toLowerCase())
                .reverse().toString();
        return reversedStr.equals(input) ? "YES" : "NO";
    }
}
