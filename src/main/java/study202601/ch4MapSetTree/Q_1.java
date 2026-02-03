package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_1 {
    /**
     * 학급회장
     */
    public static void main(String[] args) throws IOException {
        // N과 N개의 알파벳을 입력받는다.
        // 알파벳을 모두 자르고, map에 key로 저장한다. 이 때 value값은 +1
        // Map에서의 한 칸을 엔티리라고 한다. (key+value 한 쌍)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");

        String answer = getSolution(N, input);
        System.out.println(answer);

    }

    private static String getSolution(int N, String[] input) {
        int max = 0;
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        // 투표 집계
        for (String vote : input) {
            map.put(vote, map.getOrDefault(vote, 0) + 1);
        }

        // 최다 득표 후보 찾기
        // 맵의 모든 엔트리를 돌면서 가장 큰 값을 찾는다.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
