package studyWithSh.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_6 {
    /**
     * 중복문자제거
     */
    public static void main(String[] args) throws IOException {
        // 문자열을 잘라 배열에 넣는다.
        // 빈 문자열 변수를 하나 생성한다.
        // 빈 문자열 변수와 배열의 개별 값을 contains()로 비교한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = solution(input);
        System.out.println(answer);


    }

    private static String solution(String input) {
        String[] arr = input.split("");
        String answer = "";
        for (String s : arr) {
            if (!answer.contains(s)) {
                answer += s;
            }
        }
        return answer;
    }
}
