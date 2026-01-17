package studyWithSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9 {
    /**
     * 숫자만 추출
     */
    public static void main(String[] args) throws IOException {
        // 이전 문제와 동일한 방법으로 풀어보자.
        // 1. 정규식을 이용해 숫자가 아닌 문자는 제거한다. [^0-9]
        // 2. int 타입으로 형변환 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(getSolution(input));

    }

    private static int getSolution(String input) {
        String filtered = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(filtered);
    }
}
