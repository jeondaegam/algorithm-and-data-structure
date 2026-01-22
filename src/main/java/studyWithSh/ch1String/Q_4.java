package studyWithSh.ch1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4 {
    /**
     * 단어 뒤집기
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 3 || n > 20) return;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String reserved = solution(line);
            System.out.println(reserved);
        }
    }

    public static String solution(String line) {
        return new StringBuilder(line).reverse().toString();
    }
}
