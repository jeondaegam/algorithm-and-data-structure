package doit.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class doit_013_카드게임 {
    /**
     * 카드게임
     * 백준 온라인 저지 2164번
     * 시간제한 2초
     */
    public static void main(String[] args) throws IOException {
        int N; // 카드의 개수
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // 큐에 카드 저장하기
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            // 맨 위의 카드를 버림
            // 다음 카드를 맨 뒤로 삽입
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.peek()); // 마지막 남은 카드 출력

    }

}
