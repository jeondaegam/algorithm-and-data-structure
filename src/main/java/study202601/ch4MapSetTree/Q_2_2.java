package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_2_2 {
    /**
     * 다시풀자
     * 아나그램 (알파벳의 나열 순서는 다르지만 그 구성이 일치하는 두 단어)
     * 예를 들면 "AbaAeCe" 와 "baeeACA"
     */
    public static void main(String[] args) throws IOException {
        /**
         *
         * 1. 두 문자열을 입력받는다.
         * 2. 대소문자는 구분한다.
         * 3. 하나의 Map으로 문자 개수를 관리한다.
         * 4. 첫 번째 문자열의 각 문자를 +1로 카운팅한다.
         * 5. 두 번째 문자열의 각 문자를 -1로 감소시킨다.
         *    - Map에 문자가 없거나
         *    - 감소시키기 전 값이 0이면 아나그램이 아니다.
         * 6. 모든 검증을 통과하면 아나그램이다.
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputA = br.readLine();
        String inputB = br.readLine();

        String answer = getSolution(inputA, inputB);
        System.out.println(answer);

    }

    private static String getSolution(String inputA, String inputB) {

        Map<Character, Integer> map = new HashMap<>();

        if (inputA.length() != inputB.length()) {
            return "NO";
        }

        for (char aChar : inputA.toCharArray()) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

        for (char bChar : inputB.toCharArray()) {
            if (!map.containsKey(bChar) || map.get(bChar) == 0) {
                return "NO";
            }
            map.put(bChar, map.get(bChar) - 1);
        }
        return "YES";
    }
}
