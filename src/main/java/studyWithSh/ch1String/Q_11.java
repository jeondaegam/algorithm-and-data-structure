package studyWithSh.ch1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11 {
    /**
     * 문자열 압축
     */
    public static void main(String[] args) throws IOException {
        // 1. 문자열을 입력받는다.
        // 2. 개별 글자수만큼 반복한다.
        // 3. 체킹할 글자를 들고있는 변수, 반복 개수를 카운팅할 변수를 선언한다.
        // 4. 같은 문자를 만나면 카운팅 +1
        // 5. 다른 문자를 만나면, 이전 문자와 카운팅 값을 print
        // 6. 다음 문자를 저장, 카운팅 = 1 로 초기화

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = getSolution(input);
        System.out.println(answer);
    }

    private static String getSolution(String input) {
        StringBuilder sb = new StringBuilder();

        char target = input.charAt(0);
        int cnt = 0;

        for (char c : input.toCharArray()) {
            if (c == target) {
                cnt++;
            } else {
                // 이전 문자 기록
                sb.append(target);
                sb.append(cnt);

                // 다음 문자 카운팅 시작
                target = c;
                cnt = 1;
            }
        }

        // 마지막 글자 추가
        sb.append(target);
        sb.append(cnt);

        return sb.toString()
                .replaceAll("1", "");
    }
}
