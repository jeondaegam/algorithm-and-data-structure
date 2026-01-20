package studyWithSh.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10_2 {
    /**
     * 가장 짧은 문자거리 (다시풀기)
     */
    public static void main(String[] args) throws IOException {
        // 1. 문자열 s와 t를 입력받는다.
        // 2. 최소거리 변수를 초기화한다 (=배열 길이)
        // 3. 왼쪽 -> 오른쪽으로 돌면서 'e'를 찾는다.
        // 4. e를 찾으면 최소거리는 0
        // 5. e의 다음번 인덱스는 +1, 다다음은 +2 와 같이 최소거리 값을 증가한다.

        // 오른쪽 -> 왼쪽으로 돌면서 e를 찾는다.
        // 'e'를 찾으면 최소거리는 0
        // 다음번 인덱스는 +1, 다다음은 +2 를 저장하면서, 기존에 저장된 최소거리값과 비교해 더 작은 수를 저장한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String str = input[0];
        char target = input[1].charAt(0);

        System.out.println(getSolution(str, target));
    }

    private static String getSolution(String str, char target) {
        int n = str.length();
        int[] answer = new int[n];
        int distance = n; // 최대 나올 수 있는 거리

        // 왼쪽에서 -> 오른쪽
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == target) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        // 오른쪽에서 -> 왼쪽
        distance = n;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == target) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = Math.min(distance, answer[i]);
        }

        return Arrays.toString(answer);
    }
}
