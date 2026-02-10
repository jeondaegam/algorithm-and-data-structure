package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_6 {
    /**
     * 공주 구하기
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = getSolutionWithoutCnt(N, K);
        System.out.println("answer:" + answer);
    }

    private static int getSolution(int N, int K) {
        // 왕자들의 의자를 원형이 아닌, 일직선으로 생각
        // 큐를 하나 만들고, K번 째에 해당하는 값을 버린다.

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            queue.offerLast(i);
        }

        int count = 1;
        // 큐에 1명이 남을 때까지
        // 1~K번을 반복한다.
        while (queue.size() != 1) {

            if (count == K) {
                // K번째 왕자는 탈락시킨다.
                queue.pollFirst();
                count = 1;

            } else {
                // 맨 앞사람을 꺼내서
                int num = queue.pollFirst();
                // 맨 뒤로 보낸다.
                queue.offerLast(num);
                count++;
            }
        }

        return queue.peekFirst();
    }

    /**
     * 카운트 변수를 사용하지 않기
     */
    private static int getSolutionWithoutCnt(int N, int K) {
        Deque<Integer> queue = new ArrayDeque<>();

        // 1부터 N까지의 숫자를 저장
        for (int i = 1; i <= N; i++) {
            queue.offerLast(i);
        }

        // count 없이 while과 for문만으로 로직 수행
        // while문이 한 번 돌 때마다 for문이 새로 시작되기 때문에 i는 매번 자동으로 1부터 시작함
        while (queue.size() > 1) {

            // 1. K-1명을 뒤로 보내기
            // 앞에서 값을 빼서 뒤로 보낸다.
            for (int i = 1; i < K; i++) {
                queue.offerLast(queue.pollFirst());
            }
            // 2. K번째 사람 탈락(버림)
            // i == K 가 되ㅓ서 for문을 빠져나오면
            queue.pollFirst();

        }

        return queue.peekFirst();
    }

}
