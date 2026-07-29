package doit.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class doit_014_절댓값_힙구현 {
    /**
     * 절댓값 힙 구현하기
     * 백준 온라인 저지 11286번
     * 시간제한 2초
     * 자료구조: 우선순위 큐
     */
    public static void main(String[] args) throws IOException {

        // 절댓값이 가장 작은 값이 여러개인 경우, 그 중 가장 작은 수를 출력하자(-1,1) => 음수를 제거!m

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 질의 요청 개수
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {

//            int absNum1 = Math.abs(a);
//            int absNum2 = Math.abs(b);
//
//            if (absNum1 == absNum2) {
//                // 절댓값이 같으면 음수 우선
//                return a > b ? 1 : -1;
//            }
//            // 절댓값이 작은 데이터 우선
//            return absNum1 - absNum2;

            // 절댓값이 다르면, 절댓값이 가장 작은 수
            if (Math.abs(a) != Math.abs(b)) {
                return Math.abs(a) - Math.abs(b);
            }
            // 절댓값이 같으면 음수 우선
            return  a - b;

        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                int result = queue.isEmpty() ? 0 : queue.poll();
                System.out.println(result);
            } else {
                queue.add(x);
            }
        }

    }
}
