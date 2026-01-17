package studyWithSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_8 {
    /**
     * 유효한 팰린드롬: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
     */
    public static void main(String[] args) throws IOException {
        // 조건: 알파벳만 가지고 회문인지 검사한다.
        // 알파벳 이외의 문자는 무시하고, 대소문자를 구분하지 않는다.

        // 1. 입력받은 문자를 소문자로 변환 및 공백을 제거한다.
        // 2. 문자를 char형 배열로 만든다.
        // 2. 알파벳 이외의 문자는 제거한다. -> Character.isLetter()
        // 3. 남은 문자를 뒤집기 전, 후가 동일한지 검사한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(getSolution2(input));

    }

    private static String getSolution(String input) {
        input = input.toLowerCase();
//        String answer = ""; // String을 이어붙이면 문자가 바뀔 때마다 새로운 객체를 생성하므로 최악
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        String filtered = sb.toString();
        String reversed = sb.reverse().toString();

        return filtered.equals(reversed) ? "YES" : "NO";
    }

    // 정규식을 이용해 알파벳 이외의 문자는 제거한다.
    private static String getSolution2(String input) {
        input = input.trim().toLowerCase().replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(input).reverse().toString();
        return reversed.equals(input) ? "YES" : "NO";
    }
}
