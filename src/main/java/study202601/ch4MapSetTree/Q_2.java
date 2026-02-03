package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_2 {
    /**
     * 아나그램 (알파벳의 나열 순서는 다르지만 그 구성이 일치하는 두 단어)
     * 예를 들면 "AbaAeCe" 와 "baeeACA"
     */
    public static void main(String[] args) throws IOException {
        // 문자열 둘을 입력받는다.
        // 대소문자를 구분한다.
        // 두 단어를 한 맵에 저장한다.
        // 첫번째 단어는 글자별로 +1을 저장한다.
        // 두번째 단어는 글자별로 -1을 저장한다.
        // 두번째 단어에서 -1을 하기 바로 직전 값이 0이거나, -1를 합한 후의 값이 음수라면, 첫번째 단어와 짝이 맞지 않는 것

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputA = br.readLine().toLowerCase().split("");
        String[] inputB = br.readLine().toLowerCase().split("");

        String answer = getSolution(inputA, inputB);
        System.out.println(answer);

    }


    private static String getSolution(String[] inputA, String[] inputB) {
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        // 글자 수 카운팅
        for (int i = 0; i < inputA.length; i++) {
            mapA.put(inputA[i], mapA.getOrDefault(inputA[i], 0) + 1);
            mapB.put(inputB[i], mapB.getOrDefault(inputB[i], 0) + 1);
        }

        for (int i = 0; i < inputA.length; i++) {
            int sumA = mapA.get(inputA[i]);
            int sumB = mapB.get(inputA[i]);
            if (sumA != sumB) {
                return "NO";
            }
        }

        return "YES";
    }
}
