package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_3 {
    /**
     * 매출액의 종류
     */
    public static void main(String[] args) throws IOException {
        /**
         * ❌ Set로 매번 새로 세는 문제 아님
         * ✅ 슬라이딩 윈도우 + HashMap
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] input = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        String answer = getSolutionWithSlidingWindow(N, K, input);
        System.out.println(answer);

    }

    // 시간복잡도: O(N × K)
    private static String getSolution(int N, int K, int[] input) {
        // 각 연속 구간(K개)의 매출액 종류 개수를 구한다
        // 매 구간마다 Set을 새로 만들어 중복을 제거한다 (비효율적인 풀이)

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        // 구간의 시작 인덱스
        for (int i = 0; i <= N - K; i++) {
            set.clear();

            // i부터 K개 원소를 Set에 넣어 중복 제거
            for (int j = i; j < i + K; j++) {
                set.add(input[j]);
            }
            // 현재 구간에서의 서로 다른 매출액 개수
            sb.append(set.size()).append(" ");
        }

        return sb.toString().trim();
    }

    // 슬라이딩 윈도우 + HashMap을 이용해보자
    //      Map은 “존재 여부”가 아니라 “개수”를 관리하기 위해 쓰는 것
    //
    //  +1 : 윈도우에 들어옴
    //
    //  -1 : 윈도우에서 나감
    //
    //  0 : 완전히 사라짐 → remove
    private static String getSolutionWithSlidingWindow(int arrSize, int K, int[] input) {
        /**
         * 처음 K개를 Map에 넣고 시작
         * 오른쪽 값 추가
         * 왼쪽 값 제거(개수 0이면 삭제)
         * 매 순간 map.size()가 종류 개수
         *
         * Map에 값을 넣고, value로
         */
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        // 처음 K개를 Map에 넣어 첫 구간을 만든다
        for (int i = 0; i < K; i++) {
            // 이미 있으면 +1, 없으면 1로 시작
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }
        // 첫 구간의 종류 개수
        sb.append(map.size()).append(" ");

        int left = 0; // 윈도우의 왼쪽 끝부터 하나씩 빼기

        // 오른쪽으로 한 칸씩 이동하면서 슬라이딩
        for (int right = K; right < arrSize; right++) {
            // 오른쪽 값 추가
            // 새 값이 들어오므로 개수 + 1
            map.put(input[right], map.getOrDefault(input[right], 0) + 1);

            // 왼쪽 끝 값 제거
            // 윈도우에서 빠지므로 개수 -1
            map.put(input[left],
                    map.get(input[left]) - 1);

            // 개수가 0이 되면 Map에서 제거
            if (map.get(input[left]) == 0) {
                map.remove(input[left]);
            }

            // 왼쪽 포인터 1칸 이동
            left++;

            // 현재 구간의 매출액 개수 (중복제외)
            sb.append(map.size()).append(" ");
        }

        return sb.toString().trim();
    }
}
