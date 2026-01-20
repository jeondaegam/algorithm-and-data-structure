package studyWithSh.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_12 {
    /**
     * 암호 해독 (암호문을 아스키코드로)
     */
    public static void main(String[] args) throws IOException {
        /*
            1. 문자 개수 n과 암호 문자열을 입력받는다.
            2. 한 문자는 # 또는 * 7개로 구성되어 있다.
            3. #은 1, *은 0으로 치환한다.
            4. 전체 문자열을 n번 반복하며 앞에서부터 7글자씩 자른다.
            5. 잘라낸 7글자를 2진수 → 10진수로 변환한다.
            6. 해당 숫자를 char로 변환하여 결과 문자열에 추가한다.

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        // 출력
        String answer = getSolution(input, n);
        System.out.println(answer);
    }

    private static String getSolution(String input, int n) {

        input = input.replaceAll("\\*", "0");
        input = input.replaceAll("#", "1");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 0번째 인덱스부터 7글자를 자른다.
            String str = input.substring(0, 7);
            // 2진수를 10진수로 변환한다. (=아스키코드값)
            int num = Integer.parseInt(str, 2);
            // char형 문자로 변환
            sb.append((char) num);
            // 해독한 암호문 7글자를 잘라내 버린다.
            input = input.substring(7);
        }

        return sb.toString();
    }
}
