package doitAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class doit010 {
    /**
     * 010: 최솟값 찾기 (백준 11003)
     * 알고리즘: 최솟값 찾기
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // N개의 수
        int L = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우 크기
        Deque<Node> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 덱 뒤에서부터, 현재 값보다 큰 노드는 모두 제거
            // -> 현재 값이 더 작으니까, 걔들은 앞으로 최솟값이 될 수 없음
            // ->즉 현재 노드보다 값이 작은 노드만 남김
            while (!deque.isEmpty() && deque.peekLast().value > now) {
                deque.pollLast();
            }

            // 2. 현재 값 추가
            deque.offerLast(new Node(i, now));

            // 3. 윈도우 크기 L을 벗어난 경우 (i - L 이하 인덱스는 범위 밖)
            if (deque.peekFirst().idx <= i - L) {
                deque.pollFirst();
            }

            // 4. 덱의 맨 앞이 현재 구간의 최솟값이다.
            sb.append(deque.peekFirst().value).append(" ");

        }

        System.out.println(sb);

    }

    static class Node {
        int idx;
        int value;

        public Node(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
